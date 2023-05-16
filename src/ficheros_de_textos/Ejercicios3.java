package ficheros_de_textos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicios3 {

	public static void main(String[] args) {
		try {
			BufferedReader br1 = new BufferedReader (new FileReader("D:\\Ejercicios_PDF\\fichero1_ejercicio3_lectura.txt"));
			BufferedReader br2 = new BufferedReader (new FileReader("D:\\Ejercicios_PDF\\fichero2_ejercicio3_lectura.txt"));
			BufferedWriter bw = new BufferedWriter (new FileWriter("archivoCombinado.txt"));
			
			String linea1="";
			String linea2="";
			
			while (linea1 != null || linea2 != null) {
				
				linea1=br1.readLine();
				linea2=br2.readLine();
				
				if (linea1 !=null || linea2 != null) {
					bw.write(linea1);
					bw.newLine();
					bw.write(linea2);
					bw.newLine();
				}
			
			}
			br1.close();
			br2.close();
			bw.close();
			
			System.out.println("Copia alterna realizada");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido ejecutar el proceso");
		}

	}

}
