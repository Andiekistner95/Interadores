/*
 * Utilizando for, imprimir no console conforme exemplo abaixo 
 *(Utilizar System.out.print ao invés do System.out.println):c.	0, 2, 4, 6, 8, 10
 */
package exercicio.numero8.itemc;

public class Classe {
	public static void main(String[] args) {

		for (int aux = 0; aux <= 10; aux++) {
			if (aux % 2 == 0) {

				if (aux == 10) {
					System.out.println(aux);
				} else {
					System.out.print(aux + ", ");
				}
			}
		}
	}
}
