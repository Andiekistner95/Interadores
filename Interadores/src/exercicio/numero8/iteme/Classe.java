/*Utilizando for, imprimir no console conforme exemplo abaixo 
 *(Utilizar System.out.print ao invés do System.out.println): 0,1,3,6,10,15,21,28
 */
package exercicio.numero8.iteme;

public class Classe {
	public static void main(String[] args) {

		int soma = 0;
		
		for (int aux = 0; aux <= 28; aux++) {

			if (soma < 28) {
				soma = soma + aux;

				if (aux == 28) {
					System.out.println(soma);
				} else {
					System.out.print(soma + ", ");
				}
			}
		}
	}
}