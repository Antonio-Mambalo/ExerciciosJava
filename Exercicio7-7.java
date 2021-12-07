package com.exercicios7;

import java.util.Scanner;

public class Eercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int num = 0;
		int maior = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {

			if (num > maior) {
				maior = num;
			}
			System.out.println("Entre com um numero");
			num = scan.nextInt();
			System.out.println("Numero maior mudou para: " + maior);
		}

	}

}
