/*
 * Pergunte para o usuário digitar um valor menor que 10. Imprima o número
   descrescente de 10 até o valor digitado pelo usuário.
 */
package exercicio.numero16;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero;
		int aux = 10;

		System.out.println("Digite um valor menor que 10");
		numero = scanner.nextInt();

		while (numero > 10) {
			System.out.println("Digite um valor menor que 10");
			numero = scanner.nextInt();
		}
		for (; aux >= numero; aux--) {
			System.out.println(aux);
		}
		scanner.close();
	}
}
