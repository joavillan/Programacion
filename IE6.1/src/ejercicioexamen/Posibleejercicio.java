package ejercicioexamen;

import utiles.Libreria;

public class Posibleejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libreria a1 = new Libreria();
		
		int vector [] = new int [] {1,2,3,4,5,6};
		int contadorpar = 0;
		int contadorimpar = 0;
		
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i]%2==0) {
				contadorpar++;
			}else {
				contadorimpar++;
			}
		}
		
		int vectorpar[] = new int [contadorpar];
		int vectorimpar[] = new int [contadorimpar];
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i]%2==0) {
				for (int j = 0; j < vectorpar.length; j++) {
					vectorpar[j]=vector[i];
				}
			}else {
				for (int j = 0; j < vectorimpar.length; j++) {
					vectorimpar[j]=vector[i];
				}
			}
		}
		
		System.out.println("");
		
		for (int i = 0; i < vectorimpar.length; i++) {
			System.out.print(vectorpar[i]+" ");
		}
		for (int i = 0; i < vectorimpar.length; i++) {
			System.out.print(vectorimpar[i]+" ");
		}
		
		a1.metodoburbuja(vectorpar);
		a1.metodoburbuja(vectorimpar);
		
		int contador=1;
		
		for (int i = 0; i < vector.length; i++) {
			if (contador%2==0) {
				int a=0;
				vector[i]=vectorpar[a];
				a++;
			}else {
				int a=0;
				vector[i]=vectorimpar[a];
				a++;
			}
		}
		
		System.out.println("");
		
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}

}
