/*
 *Utilizando for, imprimir no console conforme exemplo abaixo 
 *(Utilizar System.out.print ao invés do System.out.println):
                 0,1,2,3,4,5,6,7,8,9,10

 */
package exercicio.numero8.itema;

public class Classe {
	public static void main(String[] args) {

		int max = 10;

		for (int aux = 0; aux <= max; aux++) {
			if (aux == 10) {
				System.out.println(aux);
			} else {
				System.out.print(aux + ", ");
			}
		}
	}
}
