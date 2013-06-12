package dda.clothing.store.domain.pessoa;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import bancosys.tec.component.Documentation;

import jmine.tec.persist.annotation.DiscriminatorComment;

@Entity
@DiscriminatorValue("0")
@DiscriminatorComment("FORNECEDOR")
public class Fornecedor extends Agente {
	
	private String inscricaoEstadual;

	/**
	 * @return the inscricaoEstadual
	 */
    @Documentation("INSCRICAO ESTADUAL DO FORNECEDOR")
    @Column(name="INSC_ESTAD", length=20)
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	/**
	 * @param inscricaoEstadual the inscricaoEstadual to set
	 */
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
}
