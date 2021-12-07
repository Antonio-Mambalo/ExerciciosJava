package com.exercicios.aula6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faca um programa que peca o raio de um circulo e mostre sua area
		
		Scanner scan = new Scanner(System.in);
	
		 
		 System.out.println("Entre com o raio do circulo: ");
		 
		 //vamos ler a entrada de dados com o metodo nextDouble da classe scanner
		 double raio = scan.nextDouble();
		 
		 //importamos a class Math para podermos calcular varias funcoes matematicas
		 //o pow nos ajuda a fazer o calculo 
		 double area = Math.PI * Math.pow(raio, 2);
		 
		 
		 //concatenamos a mensagem com a area
		 System.out.println("A area do circulo é: " + area);
		 
	}

}
