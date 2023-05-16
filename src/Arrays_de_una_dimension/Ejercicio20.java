package Arrays_de_una_dimension;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String[] reyes = new String[30];
		
		System.out.print("Introduzca el numero total de nombres de reyes");
		int nreyes=sc.nextInt();
		System.out.println();
		System.out.print("Vaya introduciendolos nombre de los reyes y pulse INTRO");
		for (int i=0;i<nreyes;i++) {
			reyes[i]=sc.next();
		}	
			
			
			for (int i=0;i<nreyes;i++) {
			int contador=1;
			for (int c=0;c<i;c++) {
				
				if (reyes[c].equalsIgnoreCase(reyes[i])) {
					contador++;
				
				}
			}
			System.out.println(reyes[i]+" "+ contador+"º");
		}
		
		
		
	}

}
