package questao2;

public class Pessoa {

	private String nome;
	private int idade;
	private float altura;

	Pessoa(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public float getAltura() {
		return altura;
	}

	public int getIdade() {
		return idade;
	}

}