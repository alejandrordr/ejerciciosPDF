
package Arrays_de_una_dimension;

import java.util.Random;


public class Ejercicio21 {

    
    public static void main(String[] args) {
        int[] array = new int[15];
        Random aleatorio= new Random();
       
        
        
        for ( int i =0;i<array.length;i++) {
            array[i]=aleatorio.nextInt(500);
        }
        System.out.println("Array original");
        
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i]+ " "); 
        }
        
        for (int i=0; i<array.length;i++) {
            boolean bandera = true;
            if (array[i]%5!=0) {
                while(bandera) {
                    if (array[i]%5==0) {
                        bandera =false;
                    } else {
                        array[i]=array[i]+1;
                    }
                  
                }
            }
        }
        System.out.println("Array cincuerizado");
        System.out.println();
        
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i]+ " "); 
        }
    }
    
}
