package ficheros_de_textos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader (new FileReader("D:\\Ejercicios_PDF\\primos.dat"));
			String linea ="";
			
			while(linea != null) {
			linea=br.readLine();
			System.out.print(linea+" ");
			}
			br.close();
			
		} catch (IOException e) {
			System.out.println("No se pudo leer el archivo");
		} 

	}

}
