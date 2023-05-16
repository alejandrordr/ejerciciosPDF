package Arrays_de_una_dimension;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		int[] array = new int [12];
		Scanner sc =new Scanner (System.in);
		Random aleatorio =new Random ();
	
		for (int i=0;i<12;i++) {
		
			array[i]=aleatorio.nextInt(0,200);
		}
	
		System.out.print("Indice  0   1   2   3   4   5   6   7   8   9   10  11");
		System.out.println();
		System.out.print("Valor ");
		for (int i=0;i<12;i++) {
			System.out.print(array[i]+"  ");
		}
		System.out.println();
		System.out.println("Introduzca el numero que quieres añadir");
		int valor=sc.nextInt();
		System.out.println("Introduzca la posicion donde lo quieres añadir");
		int posicion=sc.nextInt();
		
		for(int i=11;i>=0;i--) {
			
			if(i>posicion) {
				array[i]=array[i-1];
			}
			if(i==posicion) {
				array[i]=valor;
			}
			
		}
		
		System.out.print("Indice  0    1    2    3    4    5    6    7    8    9   10   11");
		System.out.println();
		System.out.print("Valor  ");
		for (int i=0;i<12;i++) {
			System.out.print(array[i]+"  ");
		}
		
		

	}

}
