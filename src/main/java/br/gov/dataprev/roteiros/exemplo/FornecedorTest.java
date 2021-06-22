package br.gov.dataprev.roteiros.exemplo;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import br.gov.dataprev.dta2.base.BaseRoteiro;
import br.gov.dataprev.dta2.base.annotation.PageObject;
import br.gov.dataprev.pageobjects.exemplo.MenuPO;
import br.gov.dataprev.pageobjects.exemplo.FornecedorPO;

public class FornecedorTest extends BaseRoteiro {
	
	@PageObject
	MenuPO menu;
	
	@PageObject
	FornecedorPO page;
	
	@Test
	public void incluirFornecedor() {
		menu.acessarCadastroFornecedor();
		
		FornecedorPO page = new FornecedorPO();
		page.novoFornecedor();
		page.setNome("Fornecedor teste DTA rk");
		page.confirmar();
		
		Assert.assertEquals("O fornecedor 'Fornecedor teste DTA' foi inserido com sucesso. O fornecedor Fornecedor teste DTA foi inserido com sucesso.", 
				page.obterMensagemSucesso());
	}
	
	@Test
	@Ignore
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