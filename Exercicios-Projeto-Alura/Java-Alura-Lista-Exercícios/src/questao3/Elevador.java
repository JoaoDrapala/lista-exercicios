package questao3;

public class Elevador {

	private int andarAtual;
	private int numeroAndares;
	private int capacidadeElevador;
	private int pessoasNoElevador;

	public void inicializa(int capacidadeElevador, int numeroAndares) {
		andarAtual = 0;
		pessoasNoElevador = 0;
		this.capacidadeElevador = capacidadeElevador;
		this.numeroAndares = numeroAndares;

		System.out.println("Inicializando o elevador com capacidade de " 
				+ capacidadeElevador
				+ " pessoas em um prédio de " + numeroAndares + " andares.");
	}

	public static void executar(int capacidade, int numeroAndares) {
		Elevador elevador = new Elevador();

		elevador.inicializa(capacidade, numeroAndares);

		elevador.entra();

		elevador.sai();

		elevador.sobe();

		elevador.sobe();

		elevador.desce();
	}

	public void entra() {
		if (pessoasNoElevador < capacidadeElevador) {
			pessoasNoElevador++;
			System.out.println("Pessoa adicionada com sucesso");
		} else {
			System.out.println("Não há capacidade pra adicionar mais pessoas");
		}

	}

	public void sai() {
		if (pessoasNoElevador > 0) {
			pessoasNoElevador--;
			System.out.println("Pessoa saiu do elevador");
		} else {
			System.out.println("Não tem ninguém no elevador");
		}
	}

	public void sobe() {
		if (andarAtual < numeroAndares) {
			andarAtual++;
			System.out.println("Subiu para o andar " + andarAtual);
		} else {
			System.out.println("Impossivel subir");
		}
	}

	public void desce() {
		if (andarAtual > 0) {
			andarAtual--;
			if (andarAtual == 0) {
				System.out.println("Desceu para o térreo");
			} else {
				System.out.println("Desceu para o  andar " + andarAtual);
			}
		} else {
			System.out.println("Impossivel descer");
		}
	}
}
