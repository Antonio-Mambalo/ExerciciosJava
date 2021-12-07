package com.exercicios.aula11;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faca um programa que peca 2 numeros inteiros e um numero real. calcule e
		 * mostre: a)O produto do dobro do primeiro numero com a metade do segundo b) a
		 * soma do triplo do primeiro com o terceiro c) o terceiro elevado ao cubo
		 */
		
		Scanner scan = new Scanner(System.in);
		
		// faremos um output de pergunta ao usuario
		System.out.println("Digite o primeiro numero inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro numero inteiro: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite um numero real: ");
		double num3 = scan.nextDouble();
		
		int resultado1 = (num1 * 2) * (num2 / 2);
		
		double resultado2 = (num1 * 3) + num3;
		
		double resultado3 = Math.pow (num3, 3);
		
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 1: " + resultado2);
		System.out.println("Resultado 1: " + resultado3);
	}

}
