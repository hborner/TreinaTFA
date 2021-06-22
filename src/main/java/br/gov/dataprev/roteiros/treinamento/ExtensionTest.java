package br.gov.dataprev.roteiros.treinamento;

import org.junit.Test;

import br.gov.dataprev.dta2.base.BaseRoteiro;
import br.gov.dataprev.dta2.base.annotation.PageObject;
import br.gov.dataprev.pageobjects.exemplo.MenuPO;
import br.gov.dataprev.pageobjects.treinamento.ExtensionTestPO;

public class ExtensionTest extends BaseRoteiro {

	@PageObject
	MenuPO menu;
	
	@PageObject
	ExtensionTestPO page;
	
	@Test
	public void teste() {
		menu.acessarCadastroProdutos();
		page.escreverCodigo("1234");
	}
}
