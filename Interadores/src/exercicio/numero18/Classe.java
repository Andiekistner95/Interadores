/*
 * Imprima de 70 a 10 utilizando while.
 */
package exercicio.numero18;

public class Classe {
	public static void main(String[] args) {

		int num = 10;
		int num2 = 70;

		while (num2 >= num) {
			System.out.print(num2 + " - ");
			num2--;
		}
	}
}
