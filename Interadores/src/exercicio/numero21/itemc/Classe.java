/*Reescreva as seguintes questões trocando o for pelo while (14. j.)
 * @@@@@@@
   @_____@
   @_____@
   @#####@
   @_____@
   @_____@
   @@@@@@@
 */
package exercicio.numero21.itemc;

public class Classe {

	public static void main(String[] args) {

		int linha1 = 1;
		int linha5 = 7;

		while (linha1 <= linha5) {
			if (linha1 == 1 || (linha1 == 7)) {
				System.out.println("@@@@@@@");
			} else if (linha1 == 4) {
				System.out.println("@#####@");

			} else {

				System.out.println("@_____@");

			}
			linha1++;
		}
	}
}
