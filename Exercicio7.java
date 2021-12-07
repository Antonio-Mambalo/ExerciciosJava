package com.exercicios.aula7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faca um programa que calcule a area de um quadrado, em seguida mostre o dobro desta area ao usuario
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		//fazemos a multiplicacao do lado do quadrado
		double area = Math.pow(lado, 2);
		
		//primeiro imprimimos a area do quadrado
		System.out.println("A area do quadrado é: " + area);
		
		//depois imprimimos o dobro da area do quadrado
		System.out.println("O dobro da area do quadrado é: " + (area * 2));
		
		 
	}

}
