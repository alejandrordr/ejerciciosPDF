package Arrays_de_una_dimension;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int array[]= new int [100];
		String mensaje="";
		
		for(int i=0; i<100;i++) {
			array[i]=(int)(Math.random()*21);
		}
		System.out.print("Inserte el numero que desea cambiar");
		int num1=sc.nextInt();
		System.out.print("Inserte el numero que le sustituira");
		int num2=sc.nextInt();
		
		for(int i=0; i<array.length;i++) {
			
			if (array[i]==num1) {
				array[i]=num2;
			}
		}
		for(int i=0; i<100;i++) {
			
			if (array[i]==num2) {
			mensaje +=" \""+array[i] +"\"";	
			}else {
				mensaje +=" "+ array[i];
			}
		}
		for(int i=0; i<100;i++) {
			System.out.print(mensaje);
		}

	}

}
