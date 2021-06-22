package br.gov.dataprev.roteiros.treinamento;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import br.gov.dataprev.dta2.base.BaseRoteiroDataDrivenComChave;
import br.gov.dataprev.dta2.base.annotation.PageObject;
import br.gov.dataprev.dta2.massa.CarregarMassa;
import br.gov.dataprev.pageobjects.exemplo.MenuPO;
import br.gov.dataprev.pageobjects.treinamento.ProdutosPO;

@CarregarMassa(arquivo="massa.csv", colunaNomeCT="cenario")
public class DataDrivenTest extends BaseRoteiroDataDrivenComChave {

	@PageObject
	MenuPO menu;
	
	@PageObject
	ProdutosPO produto;
	
	@Parameters(name="{0}")
	public static Collection<String> colecao() throws FileNotFoundException, IOException{
		return getCollection(DataDrivenTest.class);
	}
	
	@Test
	public void teste() {
		// acesso tela produto
		menu.acessarCadastroProdutos();
		
		// fazer pesquisa
		produto.clicarPesquisa();
		
		// selecionar produto
		produto.selecionarProduto();
		
		// clicar alterar
		produto.clicarAlterar();
		
		// fazer ajsutes
		produto.setNome(massa.get("nomeProduto"));			//("Produto Teste");		// incluir o DATA DRIVEN mais generico
		
		// salvar
		produto.clicarConfirmar();
		
		// validar mens
		//Assert.assertEquals("O produto 'Produto Teste' foi alterado com sucesso. O produto Produto Teste foi alterado com sucesso.", 
		Assert.assertEquals(massa.get("MensagemEsperada"), 
								produto.obterMens());
		
		
	}
}
