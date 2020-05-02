/**
 * 
 */
package Consola;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Jhumer Siñani (OVEJA)
 *
 */
public class Ordenamiento_lista {

	public static void main(String[] args) {
		Persona[] lista = new Persona[5];
		lista[0] = new Persona("tonci", "pinto", 22);
		lista[1] = new Persona("jhilmar", "ramirez", 15);
		lista[2] = new Persona("luis", "indio", 54);
		lista[3] = new Persona("sandra", "sanchez", 21);
		lista[4] = new Persona("mercary", "jasaro", 32);
		System.out.println("----LISTA ORIGINAL-----");
		mostrar_lista(lista);
		System.out.println("----LISTA ORDENADA POR EDAD DE MENOR A MAYOR-----");
		// se crea un nuevo Comparator para especificar como se ordenara la lista
		/*
		 * o1 < o2 = o1 es menor
		 * o1 > o2 = o1 es mayor
		 * o1 = o2 = son iguales
		 */
		Arrays.sort(lista, new Comparator<Persona>() {
			@Override
			public int compare(Persona o1, Persona o2) {
				if (o1.getEdad() < o2.getEdad()) {
					return -1;
				} else if (o1.getEdad() > o2.getEdad()) {
					return 1;
				} else {

					return 0;
				}
			}

		});
		// el Arrays.sort ordeno la lista con el criterio que elegimos y ahora mostramos la lista
		mostrar_lista(lista);
		
		System.out.println("-----LISTA ORDENADA POR EL NOMBRE DE MANERA ASCENDENTE (A-Z)----");
		Arrays.sort(lista, new Comparator<Persona>() {
			
			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		});
		// el Arrays.sort ordeno la lista con el criterio que elegimos y ahora mostramos la lista
		mostrar_lista(lista);
	}
	
	
	/**
	 * Este metodo muestra una lista
	 * @param vector tiene que introducirse un vector de tipo Persona
	 */
	public static void mostrar_lista(Persona[] vector) {
		for (Persona persona : vector) {
			System.out.println(persona.toString());
		}
	}

}

class Persona {
	String nombre;
	String apellido;
	int edad;

	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido() {
		return apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public String toString() {
		return nombre + " " + apellido + " " + edad;

	}

}
