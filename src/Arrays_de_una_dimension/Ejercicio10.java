package Arrays_de_una_dimension;

public class Ejercicio10 {

	public static void main(String[] args) {
		int[] array = new  int [20];
		int[] array2 = new  int [20];
		int y=0;
		int z=19;
		
		for(int i =0;i<20;i++) {
			array[i]=(int)(Math.random()*101);
		}
		for (int i=0;i<20;i++) {
			if (array[i]%2==0) {
				array2[y]=array[i];
					y++;
			}else {
					array2[z]=array[i];
					z--;
			}
		}
		
		for (int i=0;i<20;i++) {
		System.out.print(array2[i]+" ");
		}
	}

}
