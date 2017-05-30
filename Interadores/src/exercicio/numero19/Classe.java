/*
 * Imprima apenas valores ímpares e múltiplos de 3, de 0 a 100 utilizando while.
 */
package exercicio.numero19;

public class Classe {
	public static void main(String[] args) {

		int num = 0;
		int num2 = 100;

		while (num <= num2) {
			if(num % 3 == 0 && num % 2 != 0)
			System.out.print(num + " - ");
			num++;
		}
	}
}
