package questao1;

import java.util.Calendar;

public class Testa_Metodo_Get_Calendar {

	public static void main(String[] args) {

		Calendar dataAtual = Calendar.getInstance();
		int ano = dataAtual.get(Calendar.YEAR);
		int mes = dataAtual.get(Calendar.MONTH);
		int dia = dataAtual.get(Calendar.DAY_OF_MONTH);

		System.out.println("Hoje � dia " + dia + " do m�s " + mes 
				+ " do ano de " + ano);

	}
}