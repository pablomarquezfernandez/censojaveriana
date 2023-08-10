package co.edu.javeriana.censo.util;

import java.util.Iterator;

public class Util {

	public static int contar( Iterable elementos ) {
		int cantidad = 0;
		Iterator it = elementos.iterator();
		while( it.hasNext() ) {
			it.next();
			cantidad++;
		}
		
		return cantidad;
	}
	
	public static String formatear( String texto ) {
		String definitivo = texto;
		
		definitivo = definitivo.replace("á", "a");
		definitivo = definitivo.replace("é", "e");
		definitivo = definitivo.replace("í", "i");
		definitivo = definitivo.replace("ó", "o");
		definitivo = definitivo.replace("ú", "u");
		
		
		definitivo = definitivo.replace("Á", "A");
		definitivo = definitivo.replace("É", "E");
		definitivo = definitivo.replace("Í", "I");
		definitivo = definitivo.replace("Ó", "O");
		definitivo = definitivo.replace("Ú", "U");
		
		definitivo = definitivo.replace(".", "");
		definitivo = definitivo.replace(",", "");
		
		
		return definitivo;
	}
}
