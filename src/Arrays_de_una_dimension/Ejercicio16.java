package Arrays_de_una_dimension;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		int [] array = new int [20];
		Random aleatorio = new Random();
		Scanner sc = new Scanner (System.in);
		
		for (int i =0; i<array.length; i++) {
			
			array[i]= aleatorio.nextInt(-1, 401);	
		}
		
		for (int i =0; i<array.length; i++) {
				if (i==10) {
					System.out.println();
				}
			    System.out.print(array[i]+" ");	
		}
		System.out.println();
		System.out.println("Que numeros quieres resaltar");
		System.out.println("1. Los multiplos de 5");
		System.out.println("2. Los multiplos de 7");
		int resp=sc.nextInt();
		
		if (resp==1) {
			for (int i =0; i<array.length;i++) {
				if (array[i]%5==0) {
					System.out.print("["+array[i]+"] ");
				}else {
					System.out.print(array[i]+" ");
				}
			}
		}else {
			for (int i =0; i<array.length;i++) {
				if (array[i]%7==0) {
					System.out.print("["+array[i]+"] ");
				}else {
					System.out.print(array[i]+" ");
				}
			}
		}

	}

}
