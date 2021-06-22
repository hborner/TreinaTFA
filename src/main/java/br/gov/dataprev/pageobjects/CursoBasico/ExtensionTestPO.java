package br.gov.dataprev.pageobjects.CursoBasico;

import br.gov.dataprev.dta2.pageobjects.GenericPageObject;
import br.gov.dataprev.share.ProjetoUtils;

public class ExtensionTestPO extends GenericPageObject {

	public void escreverCodigo(String codigo) {
		getEngine().escreverPorId("form:pesquisaCodigoProduto", codigo);
//		ProjetoUtils utils = new ProjetoUtils();
//		utils.escrever("form:pesquisaCodigoProduto", codigo);
		getEngine().esperar(3000);
	}
	
}
