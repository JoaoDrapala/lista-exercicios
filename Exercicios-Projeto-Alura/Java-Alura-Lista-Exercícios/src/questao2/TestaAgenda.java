package questao2;

public class TestaAgenda {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		String nome1 = "Tayse";
		String nome2 = "Yasmim";
		String nome3 = "Joao";
		String nome4 = "Rayssa";

		int idade1 = 19;
		int idade2 = 23;
		int idade3 = 23;
		int idade4 = 30;

		float altura1 = 1.63f;
		float altura2 = 1.69f;
		float altura3 = 1.51f;
		float altura4 = 1.64f;

		agenda.armazenaPessoa(nome1, idade1, altura1);
		agenda.armazenaPessoa(nome2, idade2, altura2);
		agenda.armazenaPessoa(nome3, idade3, altura3);
		agenda.armazenaPessoa(nome4, idade4, altura4);

		agenda.removePessoa(nome3);

		agenda.buscaPessoa(nome4);

		agenda.imprimeAgenda();

		agenda.imprimePessoa(2);

	}
}
