package ej17;

import java.io.IOException;

import utiles.Libreria;

public class Matrizcaracol {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Libreria a1 = new Libreria();
		
		int n=a1.excepcionint();
		
		a1.mostrarmatrizcaracol((a1.generarmatrizcaracol(n, 1)), n, n);
		
	}

}
