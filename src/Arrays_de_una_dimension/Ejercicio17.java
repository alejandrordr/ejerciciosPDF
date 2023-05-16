package Arrays_de_una_dimension;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		int [] array = new int [10];
		Random aleatorio = new Random();
		Scanner sc = new Scanner (System.in);
		int resp=0;
		boolean bandera =true;
                boolean bandera1 =true;
		
		for (int i =0; i<array.length; i++) {
			
			array[i]= aleatorio.nextInt(100);
		}
		for (int i =0; i<array.length; i++) {
			
		    System.out.print(array[i]+" ");	
		}
		
		System.out.println();
		
                
                        while (bandera) {
                            System.out.println("Marque un numero del 1 al 100 que este en array");
                            resp =sc.nextInt();
				 for (int z =0; z<array.length; z++) {
				 	if (resp==array[z]) {
				 	 bandera =false;
                                         bandera1 =false;
				 	 break;  
				 	}
					
				 }
                        while(bandera1) {
			System.out.println("El numero marcado no se encuentra en el array");
                        bandera1=false;
                        }
				 	}
			while (array[0]!=resp) {
				int num14= array[9];
			
			
				for(int i=array.length-1; i>=0;i--) {
					if (i!=0) {
						array[i]=array[i-1];
					
					}else {
						array[0]=num14;
					
					}
				}
			}
			for (int i =0; i<array.length; i++) {
			
				System.out.print(array[i]+" ");	
			}
			
		
	}	
}