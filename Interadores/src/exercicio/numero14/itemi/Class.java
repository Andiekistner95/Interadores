/*
 * @@@@@@@
   @_____@
   @_____@
   @_____@
   @_____@
   @@@@@@@
 */
package exercicio.numero14.itemi;

public class Class {
	public static void main(String[] args) {

		for (int aux = 1; aux <= 6; aux++) {
			if (aux == 1 || aux == 6) {
				System.out.println("@@@@@@@");
			} else {
				for (int aux2 = 1; aux2 <= 1; aux2++) {
					System.out.println("@_____@");
				}
			}
		}
	}
}
