package ej17;

import java.io.IOException;

import utiles.Libreria;

public class Matrizcaracol {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Libreria a1 = new Libreria();
		
		int n=a1.excepcionint();
		int matrizcaracol [][] = new int [n][n];
		int valor=1;
		int a=0;
		int b=n-1;
		int contador=0;
		
		//int contador=0;
		
		for (int i = a; i <= b; i++) {
			matrizcaracol[a][i]=valor++;
		}
		
		//a++;
		
		for (int i = a+1; i < matrizcaracol.length; i++) {
			matrizcaracol[i][b]=valor++;
		}
		
		for (int i = b-1; i >= a; i--) {
			matrizcaracol[b][i]=valor++;
		}
		
		for (int i = a; i >= 1; i--) {
			matrizcaracol[i][a]=valor++;
		}
		
		for (int i = 0; i < matrizcaracol.length; i++) {
			for (int j = 0; j < matrizcaracol.length; j++) {
				contador++;
				if (contador==n) {
					System.out.println(matrizcaracol[i][j]+" ");
					contador=0;
				}else {
					System.out.print(matrizcaracol[i][j]+" ");
				}
			}
		}
	}

}
