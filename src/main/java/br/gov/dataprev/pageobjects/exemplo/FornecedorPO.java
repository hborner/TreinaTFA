package br.gov.dataprev.pageobjects.exemplo;

import br.gov.dataprev.dta2.base.LocationDescriptor;
import br.gov.dataprev.dta2.pageobjects.GenericPageObject;

public class FornecedorPO extends GenericPageObject {

	public void novoFornecedor() {
		getEngine().clicarPorID("form:botaoNovo");
	}
	
	public void pesquisar() {
		getEngine().clicarPorID("form:botaoPesquisar");
	}
	
	public void confirmar(){
		getEngine().rolarAteElementoPorId("form:botaoConfirmar");
		getEngine().clicarPorID("form:botaoConfirmar");
	}
	
	public void excluir(){
		getEngine().rolarAteElementoPorId("form:botaoExcluir");
		getEngine().clicarPorID("form:botaoExcluir");
	}
	
	public void setNome(String nome) {
		getEngine().escreverPorId("form:nome", nome);
	}
	
	public void selecionarUltimoFornecedor(){
		getEngine().rolarAteElementoPorId("form:botaoAlterar");
		if(getEngine().existeElementoPorLocator(new LocationDescriptor("//a[contains(., 'Última')]"))) {
			getEngine().clicarPorLocator(new LocationDescriptor("//a[contains(., 'Última')]"));
			getEngine().rolarAteElementoPorId("form:botaoAlterar");
		}
		getEngine().esperar(500);
		getEngine().clicarPorLocator(new LocationDescriptor("(//input[@name='gridSelecFornecedor:selected'])[last()]"));
	}
	
	public String obterMensagemSucesso(){
		return getEngine().obterTextoPorLocator(new LocationDescriptor("//li[@class='sucesso']"));
	}
	
	public String obterMensagemAlerta(){
		return getEngine().obterTextoPorLocator(new LocationDescriptor("//li[@class='alerta']"));
	}
}