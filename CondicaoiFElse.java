package Condicao;

import java.util.Scanner;

public class CondicaoiFElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// usamos o scanenr pra entrar com os dados do teclado
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um dia de semana(1-7)");
		// entre com um numero inteiro de 0-7 para poderes recebr um dia de semanha
		int diaSemana = scan.nextInt();

		if (diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda");
		} else if (diaSemana == 3) {
			System.out.println("Terca");
		} else if (diaSemana == 4) {
			System.out.println("Quarta");
		} else if (diaSemana == 5) {
			System.out.println("Quinta");
		} else if (diaSemana == 6) {
			System.out.println("Sexta");
		} else if (diaSemana == 7) {
			System.out.println("Sabado");
		} else {
			System.out.println("dIA INVALIDO");
		}
	}

}
