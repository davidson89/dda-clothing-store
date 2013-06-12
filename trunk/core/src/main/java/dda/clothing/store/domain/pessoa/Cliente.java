package dda.clothing.store.domain.pessoa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import jmine.tec.persist.annotation.DiscriminatorComment;

@Entity
@DiscriminatorValue("1")
@DiscriminatorComment("CLIENTE")
public class Cliente extends Agente {

}
