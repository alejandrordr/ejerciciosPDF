package Arrays_de_una_dimension;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int[] array = new int[10];
		int[] array2 = new int[10];
		
		
		
		for (int i=0;i<array.length;i++) {
			System.out.println("Inserte un numero (10 veces)");
			array[i]=sc.nextInt();
			
		}
		System.out.print("Indice ");
		System.out.print("0  1  2  3  4  5  6  7  8  9\n");
		System.out.print("Valor  ");
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");		
		}
		for (int i=0;i<array.length;i++) {
			int d =9;
			int y =0;
			  if (array[i] <= 1) {
				  	
		            array2[d]=array[i];
		            d--;
		        }
		        for (int c = 2; c <=array[i]; c++) {
		        	
		            if (array[i] % c == 0) {
		            	 array2[d]=array[i];
		            	 d--;
		            	 break;
				            
		            }else {
		            	  array2[y]=array[i];
		  	            y++;
		  	            
		            }
		        }
		       
		    }
		System.out.println();
		System.out.print("Valor  ");
		for (int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");		
		}
		}
	}


