/*
 * Utilizando for, imprimir no console um abaixo do outro, valores de 5 a 100,
 * somente valores múltiplos de 5.
 */
package exercicio.numero2;

public class Classe {
	public static void main(String[] args) {

		int max = 100;

		for (int aux = 5; aux <= max; aux++) {
			if (aux % 5 == 0)
				System.out.println(aux);
		}
	}
}
