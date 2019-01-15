package ej14;

public class Factorialrecursivo {
	
	public static int factorial(int x) {
		int y=x-1;
		if (y==1) {
			return x;
		}else {
			return x*factorial(x-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=factorial(6);
		System.out.println(n);
		
	}

}
