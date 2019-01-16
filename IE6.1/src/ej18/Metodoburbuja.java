package ej18;

import java.io.IOException;

import utiles.Libreria;

public class Metodoburbuja {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Libreria a1 = new Libreria();
		
		int n=a1.excepcionint();
		int matriz [][] = new int [n][n];
		int arraya [] = new int [n];
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j]=(int) (Math.random() * 9) + 1;
			}
		}
		
		int contador=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				contador++;
				if (contador==n) {
					System.out.println("0"+matriz[i][j]+" ");
					contador=0;
				}else {
					System.out.print("0"+matriz[i][j]+" ");
				}
			}
		}
		int n1=-1;
		do {
			n1 = a1.excepcionint();
		} while (n1<0 || n1>n);
		int temp=0;
		
		for (int i = 0; i < arraya.length; i++) {
			arraya[i]=matriz[n1][i];
		}
		
		for (int i = 0; i < arraya.length-1; i++) {
			for (int j = 0; j < arraya.length-1-i; j++) {
				if (arraya[j] > arraya[j+1]) {
					temp = arraya[j];
					arraya[j] = arraya[j+1];
					arraya[j+1]=temp;
				}
			}
		}
		
		for (int i = 0; i < arraya.length; i++) {
			System.out.print("0"+arraya[i]+" ");
		}
	}

}
