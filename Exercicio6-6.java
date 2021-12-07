package com.exercicios6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		boolean infoValido = false;
		String nome, sexo;
		int idade;
		double salario;

		do {
			System.out.println("Digite o teu nome: ");
			nome = scan.next();
			if (nome.length() > 3)
				infoValido = true;
			else {
				System.out.println("Voce deve digitar nome com mais de 3 carateres: ");
			}

		} while (!infoValido);

		infoValido = false;

		do {
			System.out.println("Digite a tua idade");
			idade = scan.nextInt();

			if (idade >= 0 && idade <= 150) {
				infoValido = true;
			} else {
				System.out.println("Digite uma idade entre 0 a 150");
			}
		} while (!infoValido);

		infoValido = false;
		do {
			System.out.println("Digite o seu Salario");
			salario = scan.nextDouble();
			if (salario >= 0) {
				infoValido = true;
			} else {
				System.out.println("digite um salario acima de 0");
			}
		} while (!infoValido);

		infoValido = false;

		do {
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValido = true;
			} else {
				System.out.println("Sexo Invalido. digite f ou m.");
			}
		} while (!infoValido);
	}

}
