/*
 *  	1
		2
		aqui é um dos meios da lista
		aqui é outro dos meios da lista
		5
		6

 */
package exercicio.numero13.itemd;

public class Classe {
	public static void main(String[] args) {

		int fim = 6;
		int meio = (fim / 2);
		int meio2 = meio +1 ;
		
		for (int aux = 1; aux <= fim; aux++) {
			if (aux == meio || aux == meio2) {
				System.out.println("aqui é o meio da lista");

			} else {
				System.out.println(aux);

			}
		}
	}
}