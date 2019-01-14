package ej17;

import java.io.IOException;

import utiles.Libreria;

public class Matrizcaracol {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Libreria a1 = new Libreria();
		
		int n=a1.excepcionint();
		int matrizcaracol [][] = new int [n][n];
		int i;
		int valor=1;
		int a=0;
		
		//int contador=0;
		
		for (i = a; i < matrizcaracol.length; i++) {
			matrizcaracol[a][i]=valor++;
		}
		
		for (a = n-1; a < matrizcaracol.length; a++) {
			matrizcaracol[a][i]=valor++;
		}
		
		
		/*for (int i = 0; i < matrizcaracol.length; i++) {
			for (int j = 0; j < matrizcaracol.length; j++) {
				matrizcaracol[i][j]=valor++;
			}
		}
		
		for (int i = 0; i < matrizcaracol.length; i++) {
			for (int j = 0; j < matrizcaracol.length; j++) {
				System.out.print(matrizcaracol[i][j]+" ");
				contador++;
				if (contador==n) {
					System.out.println("");
					contador=0;
				}
			}
		}*/
	}

}
