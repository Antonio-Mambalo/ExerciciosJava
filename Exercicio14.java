package com.exercicios.aula14;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Faca um programa que peca o tamanho de um arquivo para download(Em MB)
		 * e a velocidade de um link de internet (em Mbps), calcule e informe o tempo
		 * aproximado de download do arquivo usando este link(em Minutos)*/
		
		Scanner scan = new Scanner(System.in);
		
		//faremos um output de pergunta ao usuario
		System.out.println("Entre com o tamanho do arquivo: ");
		
		// e o usuario escolhera o tamanho do arquivo atraves do teclado
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da internet: ");
		double velocidade = scan.nextDouble();
		
		
		//e para podermos encontrar o tempo de download teremos que dividir o tamanho do arquivo com a velocidade
		double tempoAproximado = tamanhoArquivo / velocidade;
		
		//por fim mostramos ao usuario quanto tempo levara a terminar o download
		System.out.println("Tempo de download: " + tempoAproximado + "min");

	}

}
