/*
 *  1
	2 
	aqui é o meio da lista
	4
	5

 */
package exercicio.numero13.itemc;

public class Classe {
	public static void main(String[] args) {

		int inicio = 1;
		int fim = 5;
		int dif = (fim - inicio);
		int meio = (dif / 2) +1 ;
		
		for (int aux = 1; aux <= fim; aux++) {
			if (aux == meio) {
				System.out.println("aqui é o meio da lista");

			} else {
				System.out.println(aux);

			}
		}
	}
}