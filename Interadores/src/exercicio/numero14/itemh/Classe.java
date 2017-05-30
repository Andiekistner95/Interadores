/*
 * @_@
   _@_
   @_@
 */
package exercicio.numero14.itemh;

public class Classe {
	public static void main(String[] args) {

		for (int aux = 1; aux <= 3; aux++) {
			
			if (aux == 1 || aux == 3) {
				System.out.println("@_@");
			} else {
				
				for (int aux2 = 1; aux2 <= 3; aux2++) {
					
					if (aux2 == 2) {
						System.out.println("_@_");

					}

				}
			}
		}
	}
}