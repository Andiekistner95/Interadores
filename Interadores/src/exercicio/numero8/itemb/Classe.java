/*
 * Utilizando for, imprimir no console conforme exemplo abaixo 
 *(Utilizar System.out.print ao invés do System.out.println): 10,9,8,7,6,5,4,3,2,1
 */   
package exercicio.numero8.itemb;

public class Classe {
	public static void main(String[] args) {

		for (int aux = 10; aux >= 1; aux--) {
			if (aux == 1) {
				System.out.println(aux);
			} else {
				System.out.print(aux + ", ");
			}
		}
	}
}
