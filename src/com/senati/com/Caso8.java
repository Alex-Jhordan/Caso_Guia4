package com.senati.com;
import java.util.ArrayList;
import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		ArrayList<String> arrNombre = new ArrayList<String>();
		ArrayList<Integer> arrEdad = new ArrayList<Integer>();
		
		String rp = "S", nombre = "";
		int nr = 0, edad = 0;
		
		while(rp.equalsIgnoreCase("S")) {
			nr++;
			
			System.out.println("Registro N." + nr);
			System.out.println("************");
			
			System.out.print("Nombre: ");
			nombre = a.nextLine();
			System.out.print("Edad: ");
			edad = a.nextInt();
			
			arrNombre.add(nombre);
			arrEdad.add(edad);
			
			a.nextLine();
			
			rp = "";
			
			while(!rp.equalsIgnoreCase("S") && !rp.equalsIgnoreCase("N")) {
				System.out.print("¿Continuar registro [S/N]?: ");
				rp = a.nextLine();
				System.out.println("");
				if (!rp.equalsIgnoreCase("S") && !rp.equalsIgnoreCase("N"))
					System.out.println("Solo escriba S o N");
			}
		}
		
		//Impresión del contenido de los ArrayList
		System.out.println("DATOS REGISTRADOS");
		System.out.println("*****************");
		
		System.out.println("Alumno(a) \tEdad \t\tEstado");
		System.out.println("-----------------------------------------");
		
		for(int i = 0; i < arrNombre.size(); i++) {
			System.out.println(arrNombre.get(i) + "\t\t" + arrEdad.get(i) + " años\t\t" +
								VerMensaje(arrEdad.get(i)));
		}
		
	}

	// Crear métodos
	// Función (Método que devuelve un valor)
	
	public static String VerMensaje(int edad) {
		String mensaje = "Menor de edad";
		
		if (edad >= 18)
			mensaje = "Mayor de edad";
		return mensaje;
	}
	
	public static String VerEstado(int edad) {
		// Hasta 10 --> Niñez
		// Hasta 17 --> Adolescente
		// Hasta 24 --> Juventud
		// Hasta 59 --> Adulto
		// Hasta 60 a más --> Adulto Mayor
		
		String mensaje = "Niñez";
		
		if (edad > 10 && edad <= 17)
			mensaje = "Adolescente";
		else if (edad > 17 && edad <= 24)
			mensaje = "Juventud";
		else if (edad > 24 && edad <= 59)
			mensaje = "Adulto";
		else if (edad > 60)
			mensaje = "Adulto mayor";
		return mensaje;
	}
}
