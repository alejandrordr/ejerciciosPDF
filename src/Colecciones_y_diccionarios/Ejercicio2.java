package Colecciones_y_diccionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		List <Integer> numeros = new ArrayList <Integer>();
		int numale=aleatorio.nextInt(9, 21);
		
		
		
		for (int i =0;i<numale;i++) {
			int numeale=aleatorio.nextInt(100);
			numeros.add(numeale);
		}
		for (int i =0;i<numale;i++) {
			System.out.print(numeros.get(i)+ " ");
		}
		System.out.println();
		System.out.println("La suma de todos sus valores es: "+sumaLista(numeros));
		System.out.println("La media de todos sus valores es: "+mediaLista(numeros,numale));
		System.out.println("El mayor numero de la lista es: "+maxLista(numeros));
		System.out.println("El menor numero de la lista es: "+minLista(numeros));
	}
	public static int  sumaLista (List<Integer> numeros) {
		int numsuma=0;
		for (Integer i: numeros) {
			numsuma=numsuma+i;
			
		}
		return numsuma;
	}
	public static double  mediaLista (List<Integer> numeros, int numale) {
		int numsuma=0;
		for (Integer i: numeros) {
			numsuma=numsuma+i;
			
		}
		return numsuma/numale;
	}
	
	public static int  maxLista (List<Integer> numeros) {
		int max=0;
		for (Integer i: numeros) {
			if (max<i) {
				max=i;
			}
			
		}
		return max;
	}public static int  minLista (List<Integer> numeros) {
		int min=100;
		
		for (Integer i: numeros) {
			if (min>i) {
				min=i;
			}
			
		}
		return min;
	}

}

