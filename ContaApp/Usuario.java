package br.com.contaapp;

public class Usuario {
	// Atributos
	private int idUsuario;
	private String nome;
	private String cpf;
	
	// Método construtor
	public Usuario(int idUsuario) {
		// TODO Auto-generated constructor stub
		this.idUsuario = idUsuario;
	}

	// Métodos de acesso
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
