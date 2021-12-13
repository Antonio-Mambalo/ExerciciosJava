package relacionamentoAluno;

public class Cursos {

	private String nomeCurso;
	private String horario;
	private Professor professor; 
	private Alunos[] alunos;

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Alunos[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Alunos[] alunos) {
		this.alunos = alunos;
	}
	
	 public String obterInfo() {
		 String info = "Nome do Curso = " + nomeCurso + "\n";
		 
		 if(professor != null) {
			 info += professor.obterInfo();
		 }
		 
		 if(alunos != null) {
			 System.out.println("---Alunos-----");
			 for (Alunos aluno : alunos) {
				 if(aluno != null) {
					 info += aluno.obterInfo();
					 info += "\n";
				 }
				
			 }
			 info += "\n";
		 }
		 return info;
	 }
	 
	 public double obterMedia() {
		 double soma = 0;
		 for(Alunos aluno : alunos) {
			 if(aluno != null) {
				 soma += aluno.obterMedia();
			 }
		 }
		 return soma/alunos.length;
	 }

}
