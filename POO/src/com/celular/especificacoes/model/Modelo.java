package com.celular.especificacoes.model;

public class Modelo {
	
	private String nome;
	private double processador;
	private String bateria;
	private int camera;
	
	public Modelo(String nome, double processador, String bateria, int camera) {
		this.nome = nome;
		this.processador = processador;
		this.bateria = bateria;
		this.camera = camera;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getProcessador() {
		return processador;
	}

	public void setProcessador(double processador) {
		this.processador = processador;
	}

	public String getBateria() {
		return bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}

	public int getCamera() {
		return camera;
	}

	public void setCamera(int camera) {
		this.camera = camera;
	}

	public String toString() {
		return "Modelo: " + nome
				+ "\nProcessador: " + processador +"Ghz"
				+ "\nBateria: " + bateria + "mAH"
				+ "\nCamera: " + camera+ "MP";
	}
	
	
	
	


}
