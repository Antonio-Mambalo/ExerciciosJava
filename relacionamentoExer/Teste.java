package relacionamentoExer;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o Nome da Agenda");
		String nome = scan.next();
		

		Agenda agenda = new Agenda();

		Contatos[] contatos = new Contatos[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com as seguintes informacoes: " + (i + 1));
			Contatos c = new Contatos();

			System.out.println("Entre com o teu nome: ");
			nome = scan.nextLine();
			c.setNome(nome);

			System.out.println("Entre com o telefone: ");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);

			System.out.println("Entre com o email: ");
			String email = scan.nextLine();
			c.setTelefone(email);

			contatos[i] = c;

		}
		agenda.setContatos(contatos);
		if (agenda != null) {
			System.out.println(agenda.obterInfo());
		}
	}

}
