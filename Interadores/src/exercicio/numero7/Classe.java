/*
 * Utilizando for, imprimir no console um abaixo do outro, valores de 10 a 20,
 * somente valores m�ltiplos de 5 seguindo o exemplo da mensagem 
 * (Este n�mero � m�ltiplo de 5: <n�mero>) ou m�ltiplos de 10 seguindo o exemplo da mensagem
 * (Este n�mero � m�ltiplo de 10: <n�mero>).
 * Alterar o <n�mero> para o valor da vari�vel do contador.
 */
package exercicio.numero7;

public class Classe {
	public static void main(String[] args) {

		int max = 20;

		for (int aux = 10 ; aux <= max; aux++) {
			if (aux % 5 == 0){
				System.out.println("Este n�mero � m�ltiplo de 5: " + aux);
			}
				if(aux % 10 ==0){
					System.out.println("Este n�mero � m�ltiplo de 10: " + aux);
					
				}
			}	
		}
	}

