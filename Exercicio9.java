package com.exercicios.aula9;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faca um programa que peca a temperatura em graus Farenheit,
		//transforme e mostre a temperatura em graus Celsius.
		
		Scanner scan = new Scanner(System.in);
		
		//o usuario digitara a temperatura em farenheit e o valor sera armazenado em f
		System.out.println("Entre com a temperatura em Farenheit: ");
		double f = scan.nextDouble();
		
		//usamos a forma real para podermos converter a farenheit em celsius
		double c = (5 * (f-32)/ 9);
		System.out.println("A temperatura " + f + "F  igual a " + c + "C");
	}

}
