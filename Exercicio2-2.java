package com.exercicios2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faca um programa que peca um valor e mostre na tela se o valor e positivo ou negativo
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		//pedimos um  numero do usuario
		int numero = scan.nextInt();
		
		//e colocamos a nossa condicao, se o numero for maior de 0 e positivo, caso nao, negativo
		if(numero >= 0) {
			System.out.println("O numero e positivo.");
		}else {
			System.out.println("O numero e negativo");
		}
	}

}
