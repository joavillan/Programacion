package ej19;

import java.io.IOException;

import utiles.Libreria;

public class Buscararrayenmatriz {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Libreria a1 = new Libreria();
		
		int n=a1.excepcionint();
		int matriz [][] = new int [n][n];
		int arraya [] = new int [n];
		
		
		/*for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j]=(int) (Math.random() * 9) + 1;
			}
		}*/
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j]=a1.excepcionint();
			}
		}
		
		for (int i = 0; i < arraya.length; i++) {
			arraya[i]=a1.excepcionint();
		}
		
		for (int i = 0; i < arraya.length; i++) {
			System.out.println(arraya[i]);;
		}
		
		a1.escribirmatriz(matriz);
		
		int numcol = 0;
		boolean igual = false;
		
		for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j]==arraya[j]) {
                    numcol=i;
                    igual = true;
                }else {
					igual = false;
				}
            }
        }
		
		if (igual == true) {
			System.out.println("Selecciona la forma de ordenación:");
			System.out.println("1-Método burbuja");
			System.out.println("2-Inserción directa");
			
			int n3=a1.excepcionint();
			
			switch (n3) {
			case 1:
				a1.metodoburbuja(arraya);
				break;
			case 2:
				a1.insercionDirecta(arraya);
			default:
				System.out.println("Error. Introduce una opción valida");
				break;
			}
			
			for (int i = 0; i < matriz.length; i++) {
				matriz[numcol][i]=arraya[i];
			}
			
			a1.escribirmatriz(matriz);
		}else {
			System.out.println("No hay columnas iguales al array");
		}
	}

}
