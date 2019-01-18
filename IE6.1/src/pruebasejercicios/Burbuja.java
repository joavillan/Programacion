package pruebasejercicios;

import java.io.IOException;

import utiles.Libreria;

public class Burbuja {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Libreria a1 = new Libreria();
		
		int n=a1.excepcionint();
		int arraya[] = new int [n];
		
		for (int i = 0; i < arraya.length; i++) {
			arraya[i]=(int) (Math.random() * 9) + 1;
		}
		
		for (int i = 0; i < arraya.length; i++) {
			System.out.print(arraya[i]+" ");
		}
		System.out.println("");
		
		a1.metodoburbuja(arraya);
		
		for (int i = 0; i < arraya.length; i++) {
			System.out.print(arraya[i]+" ");
		}
	}

}
