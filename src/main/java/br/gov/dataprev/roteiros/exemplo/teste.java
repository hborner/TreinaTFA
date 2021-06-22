package br.gov.dataprev.roteiros.exemplo;

import org.junit.Test;

import br.gov.dataprev.dta2.base.BaseRoteiro;
import br.gov.dataprev.dta2.base.annotation.PageObject;
import br.gov.dataprev.pageobjects.exemplo.MenuPO;

public class teste extends BaseRoteiro {

	@PageObject
	MenuPO menu;
	
	@Test
	public void testes() {
//		menu.acessaURL();
	}
	
}
