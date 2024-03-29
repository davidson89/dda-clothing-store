package dda.clothing.store.domain.pessoa;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import jmine.tec.persist.annotation.Alias;

import org.hibernate.validator.NotNull;

import bancosys.tec.component.Documentation;
import bancosys.tec.persist.bussobj.PersistableBusinessObject;
import bancosys.tec.persist.persister.annotation.NaturalKey;

@Entity
@Alias("AGENT")
@Table(name = "AGENTE")
@DiscriminatorColumn(name = "TP", discriminatorType = DiscriminatorType.INTEGER)
@Documentation("ARMAZENA O CONTEUDO DO AGENTE")
@SequenceGenerator(name = "SEQ_AGENT", sequenceName = "SEQ_AGENT")
public abstract class Agente extends PersistableBusinessObject {
	
	private Long id;

	private String mnemonico;
	
	private String cpfCnpj;
	
	private String logradouro;
	
	private String cidade;
	
	private String uf;
	
	private String telefone;
	
	private String email;

	/**
	 * @return the email
	 */
    @Documentation("E-MAIL DO AGENTE")
    @Column(name="EMAIL", length=30)
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the id
	 */
    @Id
    @GeneratedValue(generator = "SEQ_AGENT")
    @Column(name = "COD_AGENTE")
    @Documentation("CODIGO DO AGENTE.")
	public Long getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @return the mnemonico
	 */

	@NotNull
	@NaturalKey
    @Documentation("NOME DO AGENTE")
    @Column(name="MNEMONICO", length=100)
	public String getMnemonico() {
		return mnemonico;
	}

	/**
	 * @param mnemonico the mnemonico to set
	 */
	public void setMnemonico(String mnemonico) {
		this.mnemonico = mnemonico;
	}

	/**
	 * @return the cpfCnpj
	 */
	@NotNull
    @Documentation("CPF OU CNPJ DO AGENTE")
    @Column(name="CPF_CNPJ", length=15)
	public String getCpfCnpj() {
		return cpfCnpj;
	}

	/**
	 * @param cpfCnpj the cpfCnpg to set
	 */
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	/**
	 * @return the logradouro
	 */
	@NotNull
    @Documentation("LOGRADOURO DO AGENTE")
    @Column(name="LOGRADOURO", length=100)
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @return the cidade
	 */
	@NotNull
	@Documentation("CIDADE DO AGENTE")
    @Column(name="CIDADE", length=60)
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the uf
	 */
	@NotNull
	@Documentation("UF DO AGENTE")
    @Column(name="UF", length=2)
	public String getUf() {
		return uf;
	}

	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * @return the telefone
	 */
	@NotNull
	@Documentation("TELEFONE DO AGENTE")
    @Column(name="TELEFONE", length=15)
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
