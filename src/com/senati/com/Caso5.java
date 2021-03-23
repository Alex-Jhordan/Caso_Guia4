package com.senati.com;
import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		String[] arrCodigo = {"A-123", "A-456", "A-789", "A-777"};
		String[] arrNombre = {"Joe Castillo", "Rosa Flores", "Karla Ramos", "Ricardo Paredes"};
		int[] arrNota = {15, 12, 17, 8};
		String estado = "";
		
		System.out.println("BÚSQUEDA DE DATOS");
		System.out.println("-----------------");
		System.out.print("Ingrese código: ");
		String codigo = a.nextLine();
		
		int p = -1;
		
		for(int x = 0; x < arrCodigo.length; x++) {
			if (codigo.equals(arrCodigo[x])) {
				p = x;
				if (arrNota[p] >= 13) estado = "APROBADO";
				else estado = "DESAPROBADO";
				break;
			}
		} 
		
		if (p == -1) {
			System.out.println("--------------------");
			System.out.println("Código no encontrado");
			System.out.println("--------------------");
		}
		else {
			System.out.println("------------------");
			System.out.println("Código registrado");
			System.out.println("------------------");
			System.out.println("Código: " + arrCodigo[p]);
			System.out.println("Nombre: " + arrNombre[p]);
			System.out.println("Nota: " + arrNota[p]);
			// Aprobado >=13
			System.out.println("Estado: " + estado);
		}
	}

}
