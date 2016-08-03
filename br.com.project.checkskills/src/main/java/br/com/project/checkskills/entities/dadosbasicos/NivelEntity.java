package br.com.project.checkskills.entities.dadosbasicos;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.project.checkskills.utils.BaseEntity;

@Entity
@Table
@AttributeOverride(name="id", column=@Column(name = "ID_NIVEL"))
public class NivelEntity extends BaseEntity<Long>  {

	private static final long serialVersionUID = 1L;

	@Column(name="nivel", nullable=false,length=45)
	private String nivel;
	
	
	public String getNivel() {
		return nivel;
	}
	
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}

