package ej15;

public class Fibonacci {
	
	public static int fibonacci(int x) {
		if (x<=100000) {
			return x;
		}else {
			return x*fibonacci(x-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fibonacci(1));
	}

}
