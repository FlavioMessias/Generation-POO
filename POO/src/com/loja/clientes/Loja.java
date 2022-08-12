package com.loja.clientes;

import com.loja.clientes.cadastro.Cadastro;

public class Loja {

	public static void main(String[] args) {
		
		Cadastro c1 = new Cadastro(" Luiz 4150, Vila MaFlavio Messias", "fhmessias11@hotmail.com", "(19) 99706-2990", "Avenida Washingtonrieta, Campinas/SP", 899.99f);
	
		c1.visualizar();
	}

}