package com.example.demo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="actor")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer actor_id;
    @Column(name="first_name")
    private String nome;

    @Column(name="last_name")
    private String cognome;

    @Column(name="last_update")
    private Date ultimo_agg ;

	public Integer getActor_id() {
		return actor_id;
	}

	public void setActor_id(Integer actor_id) {
		this.actor_id = actor_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getUltimo_agg() {
		return ultimo_agg;
	}

	public void setUltimo_agg(Date ultimo_agg) {
		this.ultimo_agg = ultimo_agg;
	}

	public Actor() {
		super();
	}

	public Actor(Integer actor_id, String nome, String cognome, Date ultimo_agg) {
		super();
		this.actor_id = actor_id;
		this.nome = nome;
		this.cognome = cognome;
		this.ultimo_agg = ultimo_agg;
	}

	@Override
	public String toString() {
		return "Actor [actor_id=" + actor_id + ", nome=" + nome + ", cognome=" + cognome + ", ultimo_agg=" + ultimo_agg
				+ "]";
	}







}
