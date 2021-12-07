package com.exercicios.aula5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// faca um programa que converta metros para centimetros

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de metro: ");

		// vamos ler a entrada de dados com o metodo nextDouble da classe scanner
		double metro = scan.nextDouble();

		// fazemos o metro multiplicado por 100 para podermos obter os centimetros
		metro = metro * 100;

		// fazemos o output da mensagem e concatenamos com o resultado
		System.out.println("Esse numero equivale a " + metro + " cm");

	}

}
