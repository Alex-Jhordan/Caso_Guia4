package com.senati.com;

public class Caso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] datos = {
				{"Joe Castillo", "Rosa Flores", "Ricardo Tello"},
				{"Callao", "Puente Piedra", "Comas"}
		};
		
		System.out.println("IMPRESIÓN POR FILAS");
		for (int f = 0; f < datos.length; f++) {
			for (int c = 0; c < datos[0].length; c++)
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			
			System.out.println("");
		}
		
		System.out.println("\nIMPRESIÓN POR COLUMNAS");
		for (int c = 0; c < datos[0].length; c++) {
			for (int f = 0; f < datos.length; f++)
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			
			System.out.println("");
		}
	}

}
