package com.vacinacao.APIvacinacao.modelos;

import javax.persistence.*;

@Entity
@Table(name="TB_VACINADOS")
public class Vacinados {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nomeVacina;
	
	private String email;
	
	private String dataAplic;

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataAplic() {
		return dataAplic;
	}

	public void setDataAplic(String dataAplic) {
		this.dataAplic = dataAplic;
	}
}
