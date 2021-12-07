package com.exercicios5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		boolean infoValidas = false;

		do {

			System.out.println("Digite o seu nome: ");
			String nome = scan.next();

			System.out.println("Digite a sua Senha: ");
			String senha = scan.next();

			if (nome.equalsIgnoreCase(senha)) {
				System.out.println("Senha igual a usuario, digite novamente");
			} else {
				infoValidas = true;
				System.out.println("Senha e usuario validos");
			}
		} while (!infoValidas);

	}
}
