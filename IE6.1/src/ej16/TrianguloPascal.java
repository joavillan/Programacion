package ej16;

public class TrianguloPascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nfilas = 5;
		int[] a = new int[1];
		
		
		for (int i = 1; i <= nfilas; i++){
			for(int k=i-5;k<=10;k++){
				System.out.print( " ");
		}
			
		int[] x = new int[i];
		
		for (int j = 0; j < i; j++) {
			if (j == 0 || j == (i - 1)) {
				x[j] = 1;
			} else {
				x[j] = a[j] + a[j - 1];
		}
			if(x[j]<10){
				System.out.print(x[j] + " ");
			}else {
				if (x[j]<100){
					System.out.print(x[j] + " ");
				}else{
					System.out.print(x[j] + " ");
				}

			}
		}
		
		a = x;
		System.out.println();
		}
	}

}
