package com.exercicios.aula13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faca um programa que pergunte quanto voce ganha por hora e o numero de horas
		 * trabalhadas no mes. sabendo se que sao descontados 11% para o Imposto renda,
		 * 8% para o INSS e 5% para o sindicato, faca um programa que nos de: SALARIO
		 * BRUTO a)quanto pagou ao INSS b)quanto pagou ao sidicato c) salario liquido
		 */

		Scanner scan = new Scanner(System.in);

		// faremos um output de pergunta ao usuario
		System.out.println("Digita o valor por hora?");

		// e o usuario escolhera o tamanho do arquivo atraves do teclado
		double valorHora = scan.nextDouble();

		// faremos um output de pergunta ao usuario
		System.out.println("Horas por mes: ");

		// e o usuario escolhera o tamanho do arquivo atraves do teclado
		double horasTrabalhadas = scan.nextDouble();

		// para obter o salario bruto fazemos a multiplicacao do valorHora e as Horas
		// Trabalhadas no mes
		double salarioBruto = valorHora * horasTrabalhadas;

		/*
		 * para poder obter as percentagens para o abate do salario, temos que dividir o
		 * salario bruto por 100 e depois multiplicarmos com o valor da percentagem
		 */
		double irenda = (salarioBruto / 100) * 11;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;

		double totalDesconto = irenda + inss + sindicato;

		// para obter o salario liquido subtraimos o salarioBruto pelo totla de Desconto
		double total = salarioBruto - totalDesconto;

		System.out.println("Salario Bruto :" + salarioBruto);
		System.out.println("IR " + irenda);
		System.out.println("Inss " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Total desconto: " + totalDesconto);
		System.out.println("Salario Liquido: " + total);
	}

}
