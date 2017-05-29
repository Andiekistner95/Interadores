/*
 * Utilizando for, imprimir no console um abaixo do outro,
 * valores de 10 a 100, somente valores múltiplos de 5 ou 10.
 */
package exercicio.numero6;

public class Classe {
	public static void main(String[] args) {

		int max = 100;

		for (int aux = -50 ; aux <= max; aux++) {
			if (aux % 5 == 0 || (aux % 10 == 0)){
				System.out.println(aux);
			}	
		}
	}
}