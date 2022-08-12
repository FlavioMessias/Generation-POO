package com.loja.clientes.cadastro;

public class Cadastro {
	
	private String  nome;
	private String email;
	private String telefone;
	private String endereco;
	private float valor;
	
	public Cadastro(String nome, String email, String telefone, String endereco, float valor) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	public void visualizar() {
		System.out.println("\n\t\tDados da compra");
		System.out.println("\n************************************************");
		System.out.println("\nNome do cliente: "+ this.getNome());
		System.out.println("\ne-mail do cliente: "+ this.getEmail());
		System.out.println("\nTelefone para contato: "+ this.getTelefone());
		System.out.println("\nEndereço de entrega: "+ this.getEndereco());
		System.out.println("\nValor da compra: "+ this.getValor());
	}
	
	
	
}
