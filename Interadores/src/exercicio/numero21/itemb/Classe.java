/*
 * Reescreva as seguintes questões trocando o for pelo while (14. i.)
 * @@@@@@@
   @_____@
   @_____@
   @_____@
   @_____@
   @@@@@@@
 */
package exercicio.numero21.itemb;

public class Classe {
	public static void main(String[] args) {

		int linha1 = 1;
		int linha5 = 5;

		while (linha1 <= linha5) {
			if (linha1 == 1 || (linha1 == 5)) {
				System.out.println("@@@@@@@");
			} else {

				System.out.println("@_____@");

			}
			linha1++;
		}
	}
}
