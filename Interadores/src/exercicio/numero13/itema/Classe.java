/*
 * Imprimir uma lista semelhante as listas abaixo:
1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9


 */
package exercicio.numero13.itema;

public class Classe {
	public static void main(String[] args) {

		for (int aux = 1; aux <= 9; aux++) {
			if (aux == 1 || aux == 9) {
				System.out.print(aux + " ");

			} else {
				System.out.print(aux + " " + aux + " ");

			}
		}
	}
}
