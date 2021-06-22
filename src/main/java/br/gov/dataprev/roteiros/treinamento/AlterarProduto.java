package br.gov.dataprev.roteiros.treinamento;

import org.junit.Assert;
import org.junit.Test;

import br.gov.dataprev.dta2.base.BaseRoteiro;
import br.gov.dataprev.dta2.base.annotation.PageObject;
import br.gov.dataprev.pageobjects.exemplo.MenuPO;
import br.gov.dataprev.pageobjects.treinamento.ProdutosPO;


public class AlterarProduto extends BaseRoteiro {

	@PageObject
	MenuPO menu;
	
	@PageObject
	ProdutosPO produto;
	
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
		produto.setNome("Produto Teste");
		
		// salvar
		produto.clicarConfirmar();
		
		// validar mens
		Assert.assertEquals("O produto 'Produto Teste' foi alterado com sucesso. O produto Produto Teste foi alterado com sucesso.", 
				produto.obterMens());
		
		
	}
}
