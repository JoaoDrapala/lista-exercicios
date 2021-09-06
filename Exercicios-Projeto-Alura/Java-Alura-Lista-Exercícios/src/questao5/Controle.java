package questao5;

import java.util.Scanner;

public class Controle {

	public static String leString() {

		Scanner sc = new Scanner(System.in);
		String resposta = sc.nextLine();
		sc.close();

		return resposta;
	}

	public static int leInteiro() {

		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();
		sc.close();

		return resposta;
	}
}