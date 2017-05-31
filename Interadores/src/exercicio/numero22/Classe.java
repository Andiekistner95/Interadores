/*
 * Diga para o usuário escrever um número, e enquanto o número digitado não for 0,
   pegue o número digitado e imprima o valor dele correspondente com a tabela ASCII.
   Caso o número digitado for 0, encerre o programa.
 */
package exercicio.numero22;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número");
		int numero = scanner.nextInt();

		while (numero != 0) {
			System.out.println(Character.toString((char) numero));

			System.out.println("Digite um número");
			numero = scanner.nextInt();
		}
		scanner.close();
	}
}
