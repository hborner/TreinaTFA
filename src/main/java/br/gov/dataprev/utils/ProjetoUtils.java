package br.gov.dataprev.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.gov.dataprev.dta2.pageobjects.GenericPageObject;

public class ProjetoUtils extends GenericPageObject {

	public void escrever(String id, String valor) {
		WebDriver driver = getEngine().getDriver();
		driver.findElement(By.id(id)).clear();
		driver.findElement(By.id(id)).sendKeys("Utils:"+valor);
	}
}
