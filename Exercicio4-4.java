package com.exercicios4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Digite uma nota: ");
			double nota = scan.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Nota certa");
			}else {
				System.out.println("Nota invalida");
			}
			
		}while(!notaValida);
		
	}

}
