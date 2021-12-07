package com.exercicios.aula2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2- Faca um programa que peca um numero e entao mostre a mensagem O numero
		// informado foi:

		// importamos um scanner para poder ler entrada de dados atravez do teclado
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero: ");

		// vamos ler um numero inteiro com o metodo nextInt da classe scanner
		int numero = scan.nextInt();

		// faremos um output da mensagem e concatenamos com o numero de entrada do usuario
		System.out.println("O numero digitado foi: " + numero);
	}

}
