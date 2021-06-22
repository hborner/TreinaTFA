package br.gov.dataprev.roteiros.treinamento;

import org.junit.Test;

import br.gov.dataprev.dta2.base.BaseRoteiro;
import br.gov.dataprev.dta2.base.annotation.PageObject;
import br.gov.dataprev.pageobjects.exemplo.MenuPO;
import br.gov.dataprev.pageobjects.treinamento.PrimeFacesPO;

public class Sincronismo extends BaseRoteiro {

	@PageObject
	MenuPO menu;
	
	@PageObject
	PrimeFacesPO page;
	
	@Test
	public void teste() throws InterruptedException {
		menu.acessarExemplosPrime();
		
		page.escolherCliente("Jose da Silva");
	}
}
