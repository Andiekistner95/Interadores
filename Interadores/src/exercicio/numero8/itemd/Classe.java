/*
 * Utilizando for, imprimir no console conforme exemplo abaixo 
 *(Utilizar System.out.print ao invés do System.out.println): 10, 7, 4, 1
 */
package exercicio.numero8.itemd;

public class Classe {
	public static void main(String[] args) {

		for (int aux = 10; aux >= 1; aux = aux - 3) {

			if (aux == 1) {
				System.out.println(aux);
			} else {
				System.out.print(aux + ", ");
			}
		}
	}
}
