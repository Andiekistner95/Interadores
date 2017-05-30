/*
 *  ______________1 14
	||||||||||||||||||||||||||||||2 30
	##############3 14
	********************4 20
	______________
	||||||||||||||||||||||||||||||
	##############
	********************
	______________
	||||||||||||||||||||||||||||||
	##############
	********************

 */
package exercicio.numero13.itemf;

public class Classe {
	public static void main(String[] args) {

		int n1 = 14;
		char simb1 = '_';

		int n2 = 30;
		char simb2 = '|';

		int n3 = 14;
		char simb3 = '#';

		int n4 = 20;
		char simb4 = '*';

		for (int aux1 = 0; aux1 < 4; aux1++) {
			for (int aux = 1; aux <= n1; aux++) {

				System.out.print(simb1);
			}
			System.out.println();
			for (int aux = 1; aux <= n2; aux++) {

				System.out.print(simb2);
			}
			System.out.println();
			for (int aux = 1; aux <= n3; aux++) {

				System.out.print(simb3);
			}
			System.out.println();
			for (int aux = 1; aux <= n4; aux++) {

				System.out.print(simb4);
			}
			System.out.println("\n");
		}
	}
}