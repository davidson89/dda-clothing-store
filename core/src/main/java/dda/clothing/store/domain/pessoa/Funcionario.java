package dda.clothing.store.domain.pessoa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import jmine.tec.persist.annotation.DiscriminatorComment;

@Entity
@DiscriminatorValue("2")
@DiscriminatorComment("FUNCIONARIO")
public class Funcionario extends Agente {

}
