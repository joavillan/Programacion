package ej1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Cuenta {

	public void cuentaPalabras(File fi){
		FileInputStream f = null;
		String s = "";
		char c;
		int cont = 0;
		try {
			f = new FileInputStream(fi);
			int size = f.available();
			for (int i = 0; i < size; i++) {
				c = (char)f.read();
				s = s+c;
				if (c == ' ' || c == '\n') {
					cont++;
					if (i != 0) {
						if (s.charAt(i-1) == ' ' && s.charAt(i) == '\n') {
							cont--;
						}
						if (s.charAt(i-1) == ' ') {
							cont--;
						}
					}else if (i == 0 && s.charAt(i) == ' ') {
						cont = 0;
					}
				}
			}
			/*if (cont != 0) {
				cont++;
			}*/
			System.out.println("Este archivo tiene "+cont+" palabras");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(s);
			try {
				f.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
