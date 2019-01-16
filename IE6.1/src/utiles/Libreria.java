package utiles;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Libreria {
BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
	
	int numeroint;
	float numerofloat;
	double numerodouble;
	int numeropos;
	int numeroneg;
	String estring;
	boolean booldato;
	long longdato;

	/**
	 * Controla la excepciones de la introducción de los datos enteros
	 * @return
	 * @throws IOException
	 */
	public int excepcionint() throws IOException {
		boolean n1=true;
		do {
			try {
				System.out.println("Introduce un valor en número entero.");
				numeroint=Integer.parseInt(teclado.readLine());
				n1=true;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Introduce un número entero.");
				n1=false;
			}
		} while (n1!=true);
			return numeroint;
	}
	
	/**
	 * Controla la excepciones de la introducción de los datos float
	 * @return
	 * @throws IOException
	 */
	public float excepcionfloat() throws IOException {
		boolean n1=true;
		do {
			try {
				System.out.println("Introduce un número");
				numerofloat=Float.parseFloat(teclado.readLine());
				n1=true;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Asegúrate de introducir un número.");
				n1=false;
			}
		} while (n1!=true);
			return numerofloat;
	}
	
	/**
	 * Controla la excepciones de la introducción de los datos double
	 * @return
	 * @throws IOException
	 */
	public double excepciondouble() throws IOException {
		boolean n1=true;
		do {
			try {
				System.out.println("Introduce un número");
				numerodouble=Double.parseDouble(teclado.readLine());
				n1=true;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Asegúrate de introducir un número.");
				n1=false;
			}
		} while (n1!=true);
			return numerodouble;
	}
	
	/**
	 * Controla la excepciones de la introducción de los datos enteros y que el valor sea positivo
	 * @return
	 * @throws IOException
	 */
	public int excepcionpos() throws IOException {
		boolean n1=true;
		do {
			try {
				numeropos=Integer.parseInt(teclado.readLine());
				if (numeropos>=0) {
					n1=true;
				}else if (numeropos<0) {
					System.out.println("Error. Introduce un número entero positivo.");
					n1=false;
				}
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Introduce un número entero positivo.");
				n1=false;
			}
		} while (n1!=true);
		return numeropos;
	}
	
	/**
	 * Controla la excepciones de la introducción de los datos enteros y que el valor sea negativo
	 * @return
	 * @throws IOException
	 */
	public int excepcionneg() throws IOException {
		boolean n1=true;
		do {
			try {
				numeroneg=Integer.parseInt(teclado.readLine());
				if (numeroneg<=0) {
					n1=true;
				}else if (numeroneg>0) {
					System.out.println("Error. Introduce un número entero negativo.");
					n1=false;
				}
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Introduce un número entero negativo.");
				n1=false;
			}
		} while (n1!=true);
		return numeroneg;
	}
	
	/**
	 * Controla la excepciones de la introducción de los datos String
	 * @return
	 * @throws IOException
	 */
	public String excepcionstring() throws IOException {
		boolean n1=true;
		do {
			try {
				estring=teclado.readLine();
			} catch (Exception ex) {
				System.out.println("ERROR. Introduce una cadena de caracteres.");
				n1=false;
			}
		} while (n1!=true);
		return estring;
	}
	
	/**
	 * Controla la excepciones de la introducción de los datos boolean
	 * @return
	 * @throws IOException
	 */
	public boolean excepcionboolean() throws IOException {
		boolean n1=true;
		do {
			try {
				booldato=Boolean.parseBoolean(teclado.readLine());
			} catch (Exception ex) {
				System.out.println("ERROR. Introduce un valor booleano.");
				n1=false;
			}
		} while (n1!=true);
		return booldato;
	}
	
	/**
	 * Controla la excepciones de la introducción de los datos long
	 * @return
	 * @throws IOException
	 */
	public long excepcionlong() throws IOException {
		boolean n1=true;
		do {
			try {
				longdato=Long.parseLong(teclado.readLine());
			} catch (Exception ex) {
				System.out.println("ERROR. Introduce un valor booleano.");
				n1=false;
			}
		} while (n1!=true);
		return longdato;
	}
	
	/**
	 * Invierte cadena de caracteres.
	 * @param cadena
	 * @return
	 */
	public String invertircadena(String cadena) {
		String cadenainvertida = "";
		for (int i = cadena.length()-1; i>=0; i--) {
			cadenainvertida+=cadena.charAt(i);
		}
		return cadenainvertida;
	}
	
	public void metodoburbuja(int array[]) {
		int temp=0;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	
	public void insercionDirecta(int A[]){
	    int p, j;
	    int aux;
	    for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
	              aux = A[p]; // el final, guardamos el elemento y
	              j = p - 1; // empezamos a comprobar con el anterior
	              while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el
	                                                                    // valor de aux sea menor que los
	                             A[j + 1] = A[j];       // de la izquierda, se desplaza a
	                             j--;                   // la derecha
	              }
	              A[j + 1] = aux; // colocamos aux en su sitio
	    }
	}
}
