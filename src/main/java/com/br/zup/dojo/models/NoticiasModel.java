package com.br.zup.dojo.models;

public class NoticiasModel {
	
	private int id;
	private String foto;
	private String nome;
	private int idade;
	private String estadoCivil;
	private String comentario;
	
	public NoticiasModel() {
		
	}
	//construtor
	public NoticiasModel(int id, String foto, String nome, int idade, String estadoCivil, String comentario) {
		super();
		this.id = id;
		this.foto = foto;
		this.nome = nome;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
		this.comentario = comentario;
	}

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
