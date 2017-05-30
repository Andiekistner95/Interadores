/*
 * @@@@@@@@@@@@
   @____#_____@
   @____#_____@
   @##########@
   @____#_____@
   @____#_____@
   @@@@@@@@@@@@
 */
package exercicio.numero14.iteml;

public class Classe {
	public static void main(String[] args) {

		for (int aux = 0; aux <= 6; aux++) {
			if (aux == 0 || aux == 6) {
				System.out.println("@@@@@@@@@@@@");
			} else if (aux == 3) {
				System.out.println("@##########@");
			} else {
				for (int aux2 = 1; aux2 <= 1; aux2++) {
					System.out.println("@____#_____@");
				}
			}
		}
	}
}
