package Arrays_de_una_dimension;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[] array = new int [8];
		
		for (int i=0;i<8;i++) {
			System.out.println("Indique un numero entero (hasta 8 numeros enteros)");
			array[i]=sc.nextInt();
		}
		for (int i=0;i<8;i++) {
			if (array[i]%2==0) {
				System.out.println ("El numero "+ array[i]+ " es par");
			}else {
				System.out.println ("El numero "+ array[i]+ " es impar");
			}
		}

	}

}
