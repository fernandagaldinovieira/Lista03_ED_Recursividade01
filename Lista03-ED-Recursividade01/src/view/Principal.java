package view;

import Controller.QuantidadeDigitosController;

public class Principal {

	public static void main(String[] args) {

		QuantidadeDigitosController qtdDigitos = new QuantidadeDigitosController();
		
		int num = 2024;
		int quantidade = qtdDigitos.QuantidadeDigitos(num);
		System.out.println("Quantidade de dígitos: " + quantidade);
	}
}
