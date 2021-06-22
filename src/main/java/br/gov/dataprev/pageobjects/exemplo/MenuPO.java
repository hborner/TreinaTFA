package br.gov.dataprev.pageobjects.exemplo;

import br.gov.dataprev.dta2.base.LocationDescriptor;
import br.gov.dataprev.dta2.pageobjects.GenericPageObject;

public class MenuPO extends GenericPageObject{

	public void acessarCadastroFornecedor(){
		getEngine().acessarURLDefault();
		getEngine().clicarPorLocator(new LocationDescriptor("//a[contains(., 'Cadastro')]"));
		getEngine().clicarPorLocator(new LocationDescriptor("//a[contains(., 'Fornecedor')]"));
	}
	
	public void acessarCadastroProdutos(){
		getEngine().acessarURLDefault();
		getEngine().clicarPorLocator(new LocationDescriptor("//a[contains(., 'Cadastro')]"));
		getEngine().clicarPorLocator(new LocationDescriptor("//a[contains(., 'Produtos')]"));
	}
	
	public void acessarExemplosPrime(){
		getEngine().acessarURLDefault();
		getEngine().clicarPorLocator(new LocationDescriptor("//a[contains(., 'Prime Faces')]"));
		getEngine().clicarPorLocator(new LocationDescriptor("//a[contains(., 'Exemplos')]"));
	}
	
}