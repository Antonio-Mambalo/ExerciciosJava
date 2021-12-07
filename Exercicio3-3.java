package com.exercicios2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faca um programa que verifique se uma letra digitada e "F" ou "M" conforme a
		 * letra escrever: F-Feminino, M-Masculino, Sexo invalido.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite entre F ou M: ");

		String letra = scan.nextLine();

		String f = "feminino";
		String m = "masculino";

		if (letra == f) {
			System.out.println("Feminino" + f);
		} else {
			// System.out.println("Sexo Invalido");
		}

	}

}
