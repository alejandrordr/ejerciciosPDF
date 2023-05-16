package Arrays_de_una_dimension;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] grados = new int [12];
		int c =0;
		
		
		for (int i = 0; i<12;i++) {
			
			c++;
			System.out.println("Introduzca la temperatura media del mes "+c);
			grados[i]=sc.nextInt();
		}
		
		System.out.println("   Mes    0----5---10---15---20---25---30---35---40");
		
		for (int i=0;i<12;i++) {
			System.out.print("   Mes    ");
			for (int z=0;z<40;z++) {
				System.out.print("#");
				if (grados[i]==z) {
				System.out.println();
				break;
				}
			}
		}
	}

}
