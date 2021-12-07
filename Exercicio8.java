package com.exercicios.aula8;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faca um Programa que pergunte quanto voce ganha por hora e o numero de horas trabalhadas no mes. 
		//Calcule e  mostre o total do seu salario no mes referido
		
		Scanner scan = new Scanner(System.in);
		
		//o funcionario digitara quanto valor recebera por hora
		System.out.println("Quanto voce ganha por hora? ");
		double valorHora = scan.nextDouble();
		
		//o funcionario digitara quantas horas trabalha por mes
		System.out.println("Numero de horas trabalhadas no mes? ");
		double horaTrabalhada = scan.nextDouble();
		
		//fazemos a multiplicacao do valorHora e Horas trabalhadas
		double totalSalario = valorHora * horaTrabalhada;
		System.out.println("O seu salario mensal é:" + totalSalario);
	}

}
