package Arrays_de_una_dimension;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] array = new int [100];
		int max=0;
		int min=500;
		
		for (int i =0; i<100;i++) {
			array[i]=(int)(Math.random()*501);
		}
		
		for (int i =0;i<100; i++) {
			if (i==10 || i==20  || i==30 || i==40 || i==50  || i==60|| i==70 || i==80  || i==90) {
				System.out.println();
			}
			if(min>array[i]) {
				min=array[i];
			}if (max<array[i]) {
				max=array[i];
			}
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Que quieres destacar ");
		System.out.println("1.-> El minimo");
		System.out.println("2.-> El maximo");
		int resp =sc.nextInt();
	
	
	if (resp==1) {
		for (int i =0;i<100; i++) {
			if (i==10 || i==20  || i==30 || i==40 || i==50  || i==60|| i==70 || i==80  || i==90) {
				System.out.println();
			}if (min==array[i]) {
				System.out.print("**"+array[i]+"** ");
			}else {
			System.out.print(array[i]+" ");
			}
		}
		
	}else {
		for (int i =0;i<100; i++) {
			if (i==10 || i==20  || i==30 || i==40 || i==50  || i==60|| i==70 || i==80  || i==90) {
				System.out.println();
			}if (max==array[i]) {
				System.out.print("**"+array[i]+"** ");
			}else {
			System.out.print(array[i]+" ");
			}
		}
	}
 }
}
