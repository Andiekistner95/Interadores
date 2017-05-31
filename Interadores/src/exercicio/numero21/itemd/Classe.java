/*Reescreva as seguintes questões trocando o for pelo while (14. l)
 * @@@@@@@@@@@@
   @____#_____@
   @____#_____@
   @##########@
   @____#_____@
   @____#_____@
   @@@@@@@@@@@@
 */
package exercicio.numero21.itemd;

public class Classe {
	public static void main(String[] args) {

		int linha1 = 1;
		int linha5 = 7;

		while (linha1 <= linha5) {
			if (linha1 == 1 || (linha1 == 7)) {
				System.out.println("@@@@@@@@@@@@");
			} else if (linha1 == 4) {
				System.out.println("@##########@");

			} else {

				System.out.println("@____#_____@");

			}
			linha1++;
		}
	}
}
