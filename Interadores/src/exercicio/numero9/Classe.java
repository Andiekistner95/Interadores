/*
 * 9.	Imprimir uma lista conforme orientações abaixo:
a.	10 - 9 - 8 - 7
b.	Perguntar para o usuário qual o valor inicial da lista, e qual o valor final da lista. Imprimir a lista conforme os valores digitados pelo usuário (O usuário deve apenas digitar valores positivos sendo o segundo valor maior que o primeiro, o sistema não precisa validar esta situação).
c.	Perguntar para o usuário qual o valor a ser somando em cada interação do for, dos valores de 0 a 100. Imprimir os valores correspondentes com a soma.
d.	Perguntar para o usuário qual o valor máximo (valor positivo maior que 0) da interação do for, começando com o valor 0. Imprimir valores correspondentes.
e.	Perguntar para o usuário qual a mensagem que ele deseja imprimir junto com os valores, em uma listagem de 0 a 10. Imprimir o valor digitado pelo usuário junto com cada número impresso no for.
f.	Perguntar para o usuário um valor e armazenar em uma variável chamada umNumero (o usuário deve digitar um valor positivo). Perguntar para o usuário outro valor e armazenar em uma variável chamada outroNumero (o usuário deve digitar um valor positivo mairo que o primeiro). Imprimir um contador de 0 100, não exibindo os valores entre os valores umNumero e outroNumero.

 */
package exercicio.numero9;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*
		 * Perguntar para o usuário qual o valor inicial da lista, e qual o
		 * valor final da lista. Imprimir a lista conforme os valores digitados
		 * pelo usuário (O usuário deve apenas digitar valores positivos sendo o
		 * segundo valor maior que o primeiro, o sistema não precisa validar
		 * esta situação).
		 */

		System.out.println("Qual o valor inicial da lista?");
		int inicial = scanner.nextInt();
		System.out.println("Qual o valor final da lista?");
		int fim = scanner.nextInt();

		for (; inicial <= fim; inicial++) {
			if (inicial == fim) {
				System.out.print(inicial);
			} else {
				System.out.print(inicial + " - ");

			}
		}
		/*
		 * Perguntar para o usuário qual o valor a ser somando em cada interação
		 * do for, dos valores de 0 a 100. Imprimir os valores correspondentes
		 * com a soma.
		 */

		int soma = 0;

		System.out.println("Qual o valor a ser somado?");
		int nsoma = scanner.nextInt();

		for(int aux = 0; aux <= 100; aux++ ){
			soma = soma + nsoma;
			
		}
		
		
		
		
		scanner.close();
	}
}
