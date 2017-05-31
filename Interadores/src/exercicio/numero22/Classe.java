/*
 * Diga para o usu�rio escrever um n�mero, e enquanto o n�mero digitado n�o for 0,
   pegue o n�mero digitado e imprima o valor dele correspondente com a tabela ASCII.
   Caso o n�mero digitado for 0, encerre o programa.
 */
package exercicio.numero22;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		int numero = scanner.nextInt();

		while (numero != 0) {
			System.out.println(Character.toString((char) numero));

			System.out.println("Digite um n�mero");
			numero = scanner.nextInt();
		}
		scanner.close();
	}
}
