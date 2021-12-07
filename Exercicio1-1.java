package com.exercicios2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero entre 0 - 10:" );
		
		double nota = scan.nextDouble();
		
		if(nota >= 0 && nota <= 10) {
			System.out.println("Voce digitou certo");
		}else {
			System.out.println("Nota invalida");
		}
		
	}

}
