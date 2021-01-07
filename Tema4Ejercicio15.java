import java.util.Scanner;

public class Tema4Ejercicio15 {
	public static  void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num; 

		System.out.print("inturduce la atura: ");
		num = teclado.nextInt();



		int resultado =numerosPrimos(num);

	}
	public static int numerosPrimos(int num) {
		int resultado = 0;



		for (int cont=1; cont <= num; cont++ ) {
			for (int cont2=0; cont2 < num; cont2++ ) {
				
				System.out.print(""+cont);
			}
			System.out.println(""+cont);
		}



		return resultado;

	}
}