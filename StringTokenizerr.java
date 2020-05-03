package Consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringTokenizerr {
	/**
	 * @author Jhumer Siñani (OVEJA)
	 *
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * EJERCICIO QUE MUESTRA EL FUNCIONAMIENTO DE STRINGTOKENIZER
		 */
		// StringTokenizer se puede separar String a traves de algun caracter

		String texto = "este-es-un-ejemplo";

		/*
		 * 
		 * este constructor solo recibe el texto, trae por defecto los sgtes limitadores
		 * (\t\n\r\f)
		 */
		StringTokenizer formato = new StringTokenizer(texto, "-");

		while (formato.hasMoreElements()) {

			System.out.println(formato.nextToken());
			System.out.println(formato.nextToken());
			System.out.println(formato.nextToken());
			System.out.println(formato.nextToken());
		}
		/*
		 * el StringTokenizer puede ser mas rapido en cuanto a separacion de cadenas
		 */

	}
}
