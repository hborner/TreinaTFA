package br.gov.dataprev.engine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.gov.dataprev.dta2.base.TestEngine;
import br.gov.dataprev.dta2.base.selenium.SeleniumTestEngine;
import br.gov.dataprev.dta2.config.ConfiguracoesTeste;

public class ProjetoEngine extends SeleniumTestEngine implements TestEngine{

	public ProjetoEngine(ConfiguracoesTeste config) {
		super(config);
	}

	@Override
	public void escreverPorId(String id, String valor) {			// tem que estar direcionado no PROPERTIES=DTA_ENGINE
		WebDriver driver = getDriver();
		driver.findElement(By.id(id)).clear();
		driver.findElement(By.id(id)).sendKeys("TesteEngine:"+valor);
	}

	//teste
	
}
