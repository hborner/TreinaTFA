/***
 * 
 * Classe de exemplo de uso para testes parametrizáveis, a partir de uma massa de dados XLS
 * 
 * 1. Indicar qual arquivo será usado como base (Cada linha corresponderá a um teste)
 * 2. Extender a classe BaseRoteiroDataDriver
 * 3. Copiar o método <code>colecao</code>, conforme exemplo abaixo
 * 4. Lembrar de usar a própria classe na chamada do getCollection
 * 5. Os dados pode ser obtidos através de uma busca no objeto "massa"
 * 
 */


package br.gov.dataprev.roteiros.exemplo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import br.gov.dataprev.dta2.base.BaseRoteiroDataDriven;
import br.gov.dataprev.dta2.massa.CarregarMassa;
import br.gov.dataprev.pageobjects.exemplo.MenuPO;
import br.gov.dataprev.pageobjects.exemplo.FornecedorPO;

//Passo 1 - Indicar qual arquivo será usado como base (Cada linha corresponderá a um teste)
@CarregarMassa(arquivo="massa.xlsx")
//Passo 2 - Extender a classe BaseRoteiroDataDriver
public class FornecedorTestParameterized extends BaseRoteiroDataDriven {

	//Passo 3 - Copiar o método abaixo
	@Parameters
	public static Collection<TreeMap<String, String>[]> colecao() throws FileNotFoundException, IOException{
		//Passo 4 - Lembrar de usar a própria classe na chamada do getCollection
		return getCollection(FornecedorTestParameterized.class);
	}

	@Test
	public void incluirFornecedor() {
		MenuPO home = new MenuPO();
		home.acessarCadastroFornecedor();
		
		FornecedorPO page = new FornecedorPO();
		page.novoFornecedor();
		String nomeFornecedor = massa.get("nomeFornecedor");
		page.setNome(nomeFornecedor);
		page.confirmar();
		
		Assert.assertEquals("O fornecedor '"+nomeFornecedor+"' foi inserido com sucesso. O fornecedor "+nomeFornecedor+" foi inserido com sucesso.", 
				page.obterMensagemSucesso());
	}
	
	@Test
	public void excluirUltimoFornecedor() {
		MenuPO home = new MenuPO();
		home.acessarCadastroFornecedor();
		
		FornecedorPO page = new FornecedorPO();
		page.pesquisar();
		page.selecionarUltimoFornecedor();
		page.excluir();
		page.confirmar();
		
		Assert.assertTrue(page.obterMensagemSucesso().endsWith("foi removido com sucesso."));
	}
}


