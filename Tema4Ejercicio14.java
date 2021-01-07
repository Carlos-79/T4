import java.util.Scanner;

public class Tema4Ejercicio14 {
	public static  void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num; 

		System.out.print("inturduce la tabla que quieres multiplicar: ");
		num = teclado.nextInt();



		int resultado =numerosPrimos(num);

	}
	public static int numerosPrimos(int num) {
		int resultado = 0, z=10;



		for (int cont=0; cont <= z; cont++ ) {
			resultado = num * cont;

			System.out.println("Tabla de multiplicar del " + num +"  "+ num   +" x " + cont +" = "+resultado);
		}



		return resultado;

	}
}
