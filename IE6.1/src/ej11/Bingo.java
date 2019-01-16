package ej11;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int carton1 [] = new int [15];
		int carton2 [] = new int [15];
		
		//asignamos los números a los cartones
		
		for (int i = 0; i < carton1.length; i++) {
			carton1[i]=(int) (Math.random()*89 +1);
		}
		
		for (int i = 0; i < carton1.length; i++) {
			System.out.print(carton1[i]+" ");
		}
		
		System.out.println("");
		
		for (int i = 0; i < carton2.length; i++) {
			carton2[i]=(int) (Math.random()*89+1);
		}
		
		for (int i = 0; i < carton2.length; i++) {
			System.out.print(carton2[i]+" ");
		}
		
		boolean gana1 = false;
		boolean gana2 = false;
		
		do {
			int n = (int) (Math.random()*89 +1);
			
			//comprobamos carton1
			for (int i = 0; i < carton1.length; i++) {
				if (carton1[i]==n) {
					carton1[i]=0;
				}
			}
			
			//comprobamos carton2
			for (int i = 0; i < carton2.length; i++) {
				if (carton2[i]==n) {
					carton2[i]=0;
				}
			}
			
			for (int i = 0; i < carton1.length; i++) {
				if (carton1[i]==0) {
					gana1=true;
				}else {
					gana1=false;
					break;
				}
				if (carton2[i]==0) {
					gana2=true;
				}else {
					gana2=false;
					break;
				}
			}
			
		} while (gana1!=true || gana2!=true);
		
		System.out.println("");
		//Comprobamos ganador
		if (gana1==true) {
			System.out.println("Gana el jugador 1");
		}else if (gana2==true) {
			System.out.println("Gana el jugador 2");
		}
		
	}

}
