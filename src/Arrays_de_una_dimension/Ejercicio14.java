package Arrays_de_una_dimension;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String[] palabras = new String [8];
		int max =7;
		int min =0;
	
	
		for (int i =0; i <8; i++) {
			System.out.println("Escriba por pantalla cualquier palabra, los colores se guardaran en las primeras posiciones ");
			String palabra =sc.nextLine();
			if (palabra.equalsIgnoreCase("verde") || palabra.equalsIgnoreCase("azul") || palabra.equalsIgnoreCase("amarillo") || palabra.equalsIgnoreCase("naranja") ||
				palabra.equalsIgnoreCase("rosa") || palabra.equalsIgnoreCase("negro") || palabra.equalsIgnoreCase("blanco") || palabra.equalsIgnoreCase("morado") || palabra.equalsIgnoreCase("rojo") ) {
			
				palabras[min]=palabra;
				min++;
			
			}else {
				palabras[max] = palabra;
				max--;
			
			}
		
	
		}
		for (int i =0; i <8; i++) {
			System.out.println(palabras[i]+ " ");
	
		
		}
	

	}

}
