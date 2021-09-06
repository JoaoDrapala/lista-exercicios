package questao1;

import java.util.Scanner;

public class TestaPessoa {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Pessoa pessoa = new Pessoa();

		System.out.println("Entre com o nome da pessoa: ");
		pessoa.setNome(scan.nextLine());

		System.out.println("Entre com a altura: ");
		pessoa.setAltura(scan.nextLine());

		System.out.println("Entre com o dia de nascimento (DD/MM/AAAA): ");
		pessoa.setDataDeNascimento(scan.next());

		pessoa.mostrarDados();
		System.out.println("idade: " + pessoa.calculaIdade(pessoa
				.getDataDeNascimento()));

		scan.close();
	}
}