 package com.exercicios.aula4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4-Faca um programa que peca 4 notas bimestrais e mostre a media

		//importamos um scanner para poder ler entrada do teclado
		Scanner scan = new Scanner(System.in);
		
		//imprimimos uma mensagem com as 4 perguntas
		System.out.println("Digite a primeira nota? Digite a segunda nota? digite a terceira nota? digite a quarta nota? ");

		//vamos ler a nota1 a nota4 com o metodo nextInt da classe scanner
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();

		//faremos um output da mensagem e concatenamos com os valores da nota
		System.out.println("Voce digitou as seguintes notas");
		System.out.println("");
		System.out.println("Primeira nota: " + nota1);
		System.out.println("Segunda nota: " + nota2);
		System.out.println("Terceira nota: " + nota3);
		System.out.println("Quarta nota: " + nota4);
		
		System.out.print("A sua media e: ");
		
		//fazemos a soma das 4 notas
		double media = nota1 + nota2 + nota3+ nota4;
		
		// dividimos a media das 4 notas por 4.
		System.out.println(media/4);
	}

}
