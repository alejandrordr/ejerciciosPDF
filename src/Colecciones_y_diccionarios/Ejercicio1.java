package Colecciones_y_diccionarios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		List<String> compañerosClase = new ArrayList <String>();
		
		compañerosClase.add("Dani");
		compañerosClase.add("Jose");
		compañerosClase.add("Jaime");
		compañerosClase.add("Marcos");
		compañerosClase.add("Alberto");
		compañerosClase.add("Veronica");
		
		
		for(String i: compañerosClase) {
			System.out.println(i);
		}
	}

}
