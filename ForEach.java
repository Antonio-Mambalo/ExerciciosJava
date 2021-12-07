package each;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[10];

		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {

			notas[i] = random.nextInt(10);
		}
		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println(notas[i]);
		}
		System.out.println("Usando o For Each");

		for (int nota : notas) {
			System.out.println(nota);
		}

		// exemplo II

		double[][] notaAlunos = new double[3][4];

		notaAlunos[0][0] = 10;
		notaAlunos[0][1] = 10;
		notaAlunos[0][2] = 10;
		notaAlunos[0][3] = 10;
		
		notaAlunos[1][0] = 10;
		notaAlunos[1][1] = 10;
		notaAlunos[1][2] = 10;
		notaAlunos[1][3] = 10;
		
		notaAlunos[2][0] = 04;
		notaAlunos[2][1] = 5;
		notaAlunos[2][2] = 6.5;
		notaAlunos[2][3] = 6;
		
		
		for(double[] notaAluno : notaAlunos) {
			for (double nota : notaAluno) {
				System.out.print(nota);
			}
		}

	}

}
