package ficheros_de_textos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercico1 {
	
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
				for (int i = 1; i < 501; i++) {
						if (esPrimo(i)) {
							bw.write(String.valueOf(i) + "\n");
						}
				}
				bw.close();
				} catch (IOException e) {
					System.out.println("Error de escritura.");
				}
	}


	
	public static boolean esPrimo(int x) {

		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				return false;
			}
		}
		return true;
	}
}



