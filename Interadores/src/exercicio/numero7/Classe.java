/*
 * Utilizando for, imprimir no console um abaixo do outro, valores de 10 a 20,
 * somente valores múltiplos de 5 seguindo o exemplo da mensagem 
 * (Este número é múltiplo de 5: <número>) ou múltiplos de 10 seguindo o exemplo da mensagem
 * (Este número é múltiplo de 10: <número>).
 * Alterar o <número> para o valor da variável do contador.
 */
package exercicio.numero7;

public class Classe {
	public static void main(String[] args) {

		int max = 20;

		for (int aux = 10 ; aux <= max; aux++) {
			if (aux % 5 == 0){
				System.out.println("Este número é múltiplo de 5: " + aux);
			}
				if(aux % 10 ==0){
					System.out.println("Este número é múltiplo de 10: " + aux);
					
				}
			}	
		}
	}

