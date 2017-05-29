/*
 * Utilizando for, imprimir no console um abaixo do outro,
 * valores de -10 a 10, somente valores positivos.
 */
package exercicio.numero3;

public class Classe {
	public static void main(String[] args) {

		int max = 10;

		for (int aux = -10 ; aux <= max; aux++) {
			if (aux > 0){
				System.out.println(aux);
			}
		}
	}
}