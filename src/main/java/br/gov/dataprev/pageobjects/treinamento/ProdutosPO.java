package br.gov.dataprev.pageobjects.treinamento;

import br.gov.dataprev.dta2.base.LocationDescriptor;
import br.gov.dataprev.dta2.pageobjects.GenericPageObject;

public class ProdutosPO extends GenericPageObject {

	// fazer pesquisa
	public void clicarPesquisa() {
		getEngine().clicarPorID("form:botaoPesquisarProduto");
	}
	
	// selecionar produto
	public void selecionarProduto() {
		//getEngine().selecionarCheckBox("gridSelecProduto:selected", true);
		getEngine().clicarPorLocator(new LocationDescriptor("//input[@type='radio']"));
		//getEngine().clicarPorLocator(new LocationDescriptor("(//input[@type='radio'])[4]"));
	}
	
	// clicar alterar 
	public void clicarAlterar() {
		getEngine().rolarTelaFim();
		getEngine().clicarPorID("form:botaoAlterar");
	}
	
	// fazer ajsutes
	public void setNome(String nome) {
		getEngine().escreverPorId("form:nome", nome);
	}
	
	// salvar
	public void clicarConfirmar() {
		getEngine().clicarPorID("form:botaoConfirmar");
	}
	
	// validar mens
	public String obterMens() {
		return getEngine().obterTextoPorLocator(new LocationDescriptor("//div[@class='mensagem']"));
	}
}
