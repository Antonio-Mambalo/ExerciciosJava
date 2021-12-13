package relacionamentoExer;

public class Agenda {
	
	private Contatos[] contatos;
	private String nome;

	public Contatos[] getContatos() {
		return contatos;
	}

	public void setContatos(Contatos[] contatos) {
		this.contatos = contatos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String obterInfo() {
		String info = "Nome =" + nome + "\n";
		
		if(contatos != null) {
			for(Contatos c : contatos) {
				info += c.obterInfo() + "\n";
			}
		}
		return info;
	}
	

	

}
