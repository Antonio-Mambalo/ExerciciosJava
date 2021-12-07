package com.exercicios.aula10;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faca um programa que peca a temperatura em graus Celsius,
		//transforme e mostre a temperatura em graus Farenheit.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Celsius: ");
		double c = scan.nextDouble();
		
		double f = c * 1.8 + 32;
		System.out.println("A temperatura " + c + "°C  igual a " + f + "°F");
	}
}
