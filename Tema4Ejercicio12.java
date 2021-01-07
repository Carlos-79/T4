import java.util.Scanner;

public class Tema4Ejercicio12 {
	public static  void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num; 

		System.out.print("inturduce la atura: ");
		num = teclado.nextInt();



		int resultado =numerosPrimos(num);

	}
	public static int numerosPrimos(int num) {
		int resultado = 0;



		for (int cont=0; cont < num; cont++ ) {

			System.out.println("*");
		}
		num = num / 2 +1;

		for (int cont2=0; cont2 < num; cont2++ ) {


			System.out.print("*");
		}

		return resultado;

	}
}

	

