package questao5;

public class Selecao extends Controle {

	public static void executar() {

		Caminhao caminhaoApto = null;

		while (true) {
			System.out.println("Digite o tipo do seu caminhão (Alfa ou Beta):");
			Caminhao caminhao = new Caminhao();
			caminhao.setTipo(leString());

			if (caminhao.getTipo().equals("Fim") || caminhao
					.getTipo().equals("fim")) {
				break;
			}

			System.out.println("Quantos Pluviometros você deseja cadastrar?");
			int qtdPluviometros = leInteiro();

			for (int contador = 0; contador < qtdPluviometros; contador++) {
				System.out.println("Digite a capacidade do pluviometro:");
				Pluviometro pluviometro = new Pluviometro();
				pluviometro.setCapacidade(leInteiro());
				caminhao.adicionaPluviometro(pluviometro);
			}

			if (caminhaoApto == null) {
				caminhaoApto = caminhao;
			} else {
				if (caminhao.getCargaAtual() > caminhaoApto.getCargaAtual()) {
					caminhaoApto = caminhao;
				}
			}

		}
		System.out.println("----- O caminhão mais apto é o " 
				+ caminhaoApto.getTipo() + " Com capacidade de "
				+ caminhaoApto.getCargaAtual() + " -----");

	}
}