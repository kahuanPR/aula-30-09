package com.sesi.tarefas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TarefaCategoria {
			
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public TarefaCategoria(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public TarefaCategoria() {
		super();
	}

	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}