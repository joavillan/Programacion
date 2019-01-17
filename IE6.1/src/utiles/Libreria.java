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
	 * @return int
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
	 * @return float
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
	 * @return double
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
	 * @return int
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
	 * @return int
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
	 * @return String
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
	 * @return boolean
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
	 * @return long
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
	 * Escribe la matriz deseada por pantalla
	 * @param matriz
	 */
	public void escribirmatriz(int matriz [][]) {
		int contador=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				contador++;
				if (contador== matriz.length) {
					System.out.println("0"+matriz[i][j]+" ");
					contador=0;
				}else {
					System.out.print("0"+matriz[i][j]+" ");
				}
			}
		}
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
	
	/**
	 * Genera la cantidad de dígitos de la sucesión de Fibonacci deseada
	 * @param n
	 * @return
	 */
	public static int fibonacci(int n) {
		if (n>1){
		       return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
		    }
		    else if (n==1) {  // caso base
		        return 1;
		    }
		    else if (n==0){  // caso base
		        return 0;
		    }
		    else{ //error
		        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
		        return -1; 
		    }
	}
	
	/**
	 * Imprime la sucesión de Fibonacci
	 * @throws IOException
	 */
	public void imprimirfibonacci() throws IOException {
		int n = excepcionint();
		for (int a = 0; a < n; a++) {
			System.out.print(fibonacci(a)+ ", ");
		}
	}
	
	/**
	 * Ordena un array de menor a mayor
	 * @param array
	 */
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
	
	/**
	 * Ordena un array de menor a mayor
	 * @param A
	 */
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
	
	/**
	 * Genera una matriz de n*n con una ordenación en forma de caracol
	 * @param n
	 * @param x
	 * @return M (matriz)
	 */
	public int[][] generarmatrizcaracol(int n, int x) {
        int[][] M = new int[n + 1][n + 1];
        for (int a = 1; a <= n / 2; a++) { // Se divide entre dos ya que hay la mitad de "n" de cada caso2
            for (int i = a; i <= n - a; i++) {//Fila hacia derecha
                M[a][i] = x;
                x++;
            }
            for (int i = a; i <= n - a; i++) {//Columna hacia abajo
                M[i][n - a + 1] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {//FIla hacia la izquierda
                M[n - a + 1][i] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {//Columna hacia arriba
                M[i][a] = x;
                x++;
            }
        }
        if (n % 2 == 1) {
            M[n / 2 + 1][n / 2 + 1] = x;
        }
        return M;
    }

    /**
     * Muestra Una Matriz Cualquiera Por Consola A Partir De La Fila 1 y Columna 1
     * @param M matriz a mostrar
     * @param f numero de filas de la matriz
     * @param c numero de columnas de la matriz
     */
    public void mostrarmatrizcaracol(int[][] M, int f, int c) {
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("\t" + M[i][j]);
            }
            System.out.println();
        }
    }
    /**
     * Determina si una cadena es un palindromo
     * @param cadena
     */
    public void palindromo (String cadena) {
    	int ini=0;
		int des = cadena.length()-1;
		boolean bError = false;
		
		while ((ini<des) && (!bError)){
			
			if (cadena.charAt(ini)==cadena.charAt(des)){				
				ini++;
				des--;
			} else {
				bError = true;
			}		
		}
		
		if (!bError) {
			System.out.println("Es un palíndromo");
		}else {
			System.out.println("No es un palíndromo");
		}
    }
    
    /**
     * Determina si un valor entero es capicua o no
     * @param entero
     */
    public void capicua (int entero) {
    	String cadena = Integer.toString(entero);
		String cadenainvertida = "";
		
		if (cadena.length()>1) {
			for (int i = cadena.length()-1; i>=0; i--) {
				cadenainvertida+=cadena.charAt(i);
			}
			int enteroinvertido = Integer.parseInt(cadenainvertida);
			if (entero==enteroinvertido) {
				System.out.println("Es capicua");
			} else {
				System.out.println("No es capicua");
			}
		}else {
			System.out.println("No es capicua");
		}
    }
}
