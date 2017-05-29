/*
 * Utilizando for, imprimir no console um abaixo do outro,
 * valores de -50 a 50, somente valores de 40 a 60.
 */
package exercicio.numero5;

public class Classe {
	public static void main(String[] args) {

		int max = 50;

		for (int aux = -50 ; aux <= max; aux++) {
			if (aux > 39 && (aux <= 60)){
				System.out.println(aux);
			}	
		}
	}
}