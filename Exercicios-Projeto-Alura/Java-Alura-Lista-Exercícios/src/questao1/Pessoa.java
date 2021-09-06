package questao1;

import java.util.Calendar;

public class Pessoa {

	private String nome;
	private String dataDeNascimento;
	private String altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public void imprimirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de nascimento: " + dataDeNascimento);
		System.out.println("Altura: " + altura);
	}

	public int calculaIdade(String dataDeNascimento) {
		String[] infosNascimento = dataDeNascimento.split("/");
		int diaNascimento = Integer.parseInt(infosNascimento[0]);
		int mesNascimento = Integer.parseInt(infosNascimento[1]);
		int anoNascimento = Integer.parseInt(infosNascimento[2]);
		int idade;

		Calendar dataAtual = Calendar.getInstance();
		int anoAtual = dataAtual.get(Calendar.YEAR);
		int mesAtual = dataAtual.get(Calendar.MONTH);
		int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);

		if (mesAtual < mesNascimento) {
			idade = anoAtual - anoNascimento - 1;
			return idade;
		} else if (mesAtual > mesNascimento) {
			idade = anoAtual - anoNascimento;
			return idade;
		} else {
			if (diaAtual < diaNascimento) {
				idade = anoAtual - anoNascimento - 1;
				return idade;
			}
			idade = anoAtual - anoNascimento;
			return idade;
		}
	}

	public void mostrarDados() {
		System.out.println("\nNome: " + this.getNome());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Data de nascimento: " + this.getDataDeNascimento());
	}

}
