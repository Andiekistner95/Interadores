/*
 * e.	1
		2
		aqui � um ter�o da lista
		4
		5
		aqui � um ter�o da lista
		7
		8
		aqui � um ter�o da lista

 */
package exercicio.numero13.iteme;

public class Classe {
	public static void main(String[] args) {


		for (int aux = 1; aux <= 9; aux++) {
			if (aux % 3 == 0) {
				System.out.println("aqui � um ter�o da lista");

			} else {
				System.out.println(aux);

			}
		}
	}
}