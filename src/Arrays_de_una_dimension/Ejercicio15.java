package Arrays_de_una_dimension;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] mesas = new int [10];
		int resp=0;
		boolean siguiente =true;
		
		while (resp != -1) {
			siguiente =true;
			System.out.println(" Buenas, ¿cuantos son?");
			resp=sc.nextInt();
			if (resp==-1) {
				break;
			}if (resp<5 && resp>0) {
				for ( int i =0; i<mesas.length; i++) {
					if (mesas[i]==0) {
						mesas[i]=resp;
						siguiente =false;
						break;
					}
				}while (siguiente) {
				for ( int i=0 ; i<mesas.length; i++) {
					if (resp==3 && mesas[i]==1) {
						mesas[i]=mesas[i]+3;
						break;
					} if (resp==2 && mesas[i]==2) {
						mesas[i]=mesas[i]+2;
						break;
					} if (resp==2 && mesas[i]==1) {
						mesas[i]=mesas[i]+1;
						break;
					}if (resp==1 && mesas[i]==3) {
						mesas[i]=mesas[i]+1;
						break;
					} if (resp==1 && mesas[i]==2) {
						mesas[i]=mesas[i]+1;
						break;
					} if (resp==2 && mesas[i]==1) {
						mesas[i]=mesas[i]+1;
						break;
					}
				}
				siguiente = false;
				}
			}else {
				System.out.println("Lo siento, ya no admitimos grupos de "+resp+" , haga grupos de 4 personas como máximo e intente de nuevo");
			}
		
			imprimeMesas(mesas);
			}
			imprimeMesas(mesas);
		}
	
	
	public static void imprimeMesas (int[] mesas) {
			System.out.println("Mesa Nº      1   2   3   4   5   6   7   8   9  10");
			System.out.print("Ocuapacion");
		for (int i =0; i<mesas.length; i++) {
			
			System.out.print("   "+mesas[i]);
		}
		System.out.println();
	}

}

