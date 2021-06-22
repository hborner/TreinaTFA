package br.gov.dataprev.pageobjects.CursoBasico;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.gov.dataprev.dta2.base.LocationDescriptor;
import br.gov.dataprev.dta2.pageobjects.GenericPageObject;

public class JSTestePO extends GenericPageObject {

	public void escreverCodigo(String codigo) {
		/// com DTA
//		getEngine().escreverPorId("form:pesquisaCodigoProduto", codigo);
		
		// com Selenium
//		WebDriver driver = getEngine().getDriver();
//		driver.findElement(By.id("form:pesquisaCodigoProduto")).clear();
//		driver.findElement(By.id("form:pesquisaCodigoProduto")).sendKeys(codigo);
		
		// com Java Script
//		getEngine().executarJavaScriptPorId("arguments[0].value = '"+codigo+"'", "form:pesquisaCodigoProduto");
//		getEngine().executarJavaScript("arguments[0].value = '"+codigo+"'", new LocationDescriptor("//*[@id='form:pesquisaCodigoProduto']"));
	
		// com JS e Selenium
		JavascriptExecutor js = (JavascriptExecutor) getEngine().getDriver();
		js.executeScript("document.getElementById('form:pesquisaCodigoProduto').value = '"+codigo+"'");
 		
	}
}
