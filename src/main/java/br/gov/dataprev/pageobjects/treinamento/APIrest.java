package br.gov.dataprev.pageobjects.treinamento;

import static io.restassured.RestAssured.given;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import br.gov.dataprev.dta2.base.BaseRoteiroREST;

public class APIrest extends BaseRoteiroREST {

	String 	//host = "https://swapi.dev",		//--> URL em properties
			//base = "/api",
			recurso = "/people",
			id		= "/1";
	
	@Test
	public void teste() {
		// setup = giver
		given()
		// ação = when
		.when()
			.get(recurso+id)
		// verificar = then
		.then()
			.statusCode(200)
			.body("name", CoreMatchers.is("teste"))
			.log().all()
		;
		
	}
	
}
