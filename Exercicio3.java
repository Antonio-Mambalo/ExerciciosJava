package com.exercicios.aula3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faca um programa que me peca dois numeros e imprima a soma

		// importamos um scanner para poder ler entrada do teclado
		Scanner scan = new Scanner(System.in);

		//imprimimos uma mensagem para o usuario ler
		System.out.println("digite o primeiro numero: ");

		// vamos ler um numero inteiro com o metodo nextInt da classe scanner
		int numero1 = scan.nextInt();
		System.out.println("digite o segundo numero: ");

		// vamos ler um numero inteiro com o metodo nextInt da classe scanner
		int numero2 = scan.nextInt();

		// aqui na variavel resultado fazemos a soma do numero1 e numero2
		int resultado = numero1 + numero2;

		// aqui imprimimos a soma dos dois numeros digitados
		System.out.println("A soma dos dois numeros e: " + resultado);
	}

}
