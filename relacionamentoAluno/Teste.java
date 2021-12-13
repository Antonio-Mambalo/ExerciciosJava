package relacionamentoAluno;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o nome do Curso: ");
		String curso = scan.nextLine();

		System.out.println("Digite o Horario: ");
		String horario = scan.nextLine();

		System.out.println("Entre com o nome do professor: ");
		String nomProf = scan.nextLine();

		System.out.println("Entre com o departamento do professor: ");
		String depProf = scan.nextLine();

		System.out.println("Entre com o email do professor: ");
		String emailProf = scan.nextLine();

		Cursos cursos = new Cursos();
		cursos.setNomeCurso(curso);
		cursos.setHorario(horario);

		Professor professor = new Professor();
		professor.setNomeProfessor(nomProf);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);

		cursos.setProfessor(professor);

		System.out.println("---------------------------");

		Alunos[] alunos = new Alunos[5];
			for (int i = 0; i < 5; i++) {
				
				System.out.println("Digite o teu nome: " + (i+1));
				String nomeAluno = scan.nextLine();
				
				System.out.println("Entre com a matricula do ano: ");
				String matricula = scan.nextLine();
				
				
				double[] notas = new double[4];
				
				for(int j=0; j<4; j++) {
					System.out.println("Entre com a nota: ");
					notas[j] = scan.nextDouble();
				}
				
				System.out.println(notas);
				
				Alunos aluno = new Alunos();
				aluno.setNomeAluno(nomeAluno);
				aluno.setMatricula(matricula);
				aluno.setNotas(notas);
				
				cursos.setAlunos(alunos);
				
				
				System.out.println(cursos.obterInfo());
				
			}
	
		}
	
	}
