package questao4;

public class TesteControle {

	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();

		c.ligar();
		c.aumentarVolume();
		c.aumentarCanal();
		c.abrirMenu();
		c.fecharMenu();

	}
}