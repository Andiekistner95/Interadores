/*
 * e.	1
		2
		aqui é um terço da lista
		4
		5
		aqui é um terço da lista
		7
		8
		aqui é um terço da lista

 */
package exercicio.numero13.iteme;

public class Classe {
	public static void main(String[] args) {


		for (int aux = 1; aux <= 9; aux++) {
			if (aux % 3 == 0) {
				System.out.println("aqui é um terço da lista");

			} else {
				System.out.println(aux);

			}
		}
	}
}