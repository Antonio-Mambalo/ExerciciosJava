package com.exercicios.aula12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
		// calcule seu peso ideal,
		// usando a seguinte formula: (72.7*altura) - 58

		Scanner scan = new Scanner(System.in);

		// faremos um output de pergunta ao usuario
		System.out.println("Qual e a sua altura? ");
		double altura = scan.nextDouble();

		//para calcular o peso ideal, usamos uma formula nos fornecida pela ciencia e so fizemos a substituicao de dados
		//e calculamos o peso ideal
		double pesoIdeal = (72.7 * altura) - 58;

		System.out.println("O seu peso ideal e: " + pesoIdeal);

	}
}
