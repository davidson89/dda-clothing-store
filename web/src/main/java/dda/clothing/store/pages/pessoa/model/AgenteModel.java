package dda.clothing.store.pages.pessoa.model;

import java.io.Serializable;

import jmine.tec.web.wicket.component.injection.FormInput;
import jmine.tec.web.wicket.component.injection.FormInputProvider;

@FormInputProvider
public class AgenteModel implements Serializable {

	private String nome;
	
	private String cpfCnpj;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	@FormInput
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpfCnpj
	 */
	public String getCpfCnpj() {
		return cpfCnpj;
	}

	/**
	 * @param cpfCnpj the cpfCnpj to set
	 */
	@FormInput
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
}
