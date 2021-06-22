package br.gov.dataprev.pageobjects.treinamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.gov.dataprev.dta2.base.LocationDescriptor;
import br.gov.dataprev.dta2.pageobjects.GenericPageObject;

public class PrimeFacesPO extends GenericPageObject {

	// nome cliente
	public void escolherCliente(String nome) throws InterruptedException {
//		getEngine().escreverPorId("primeFacesTabView:vendaForm:nomeCliente_input", nome);
//		getEngine().clicarPorLocator(new LocationDescriptor("//li[contains(., '"+nome+"')]"));
		
		// selenium sem engine
		WebDriver driver = getEngine().getDriver();
		driver.findElement(By.id("primeFacesTabView:vendaForm:nomeCliente_input")).sendKeys(nome);
		//driver.findElement(By.xpath("//li[contains(., '"+nome+"')]")).wait(5000);
		getEngine().esperarElementoPorLocator(new LocationDescriptor("//li[contains(., '"+nome+"')]"), 15000);
		driver.findElement(By.xpath("//li[contains(., '"+nome+"')]")).click();
		
	}

}
