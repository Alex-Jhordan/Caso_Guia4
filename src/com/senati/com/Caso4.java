package com.senati.com;
import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		int numeros_pares = 0, numeros_impares = 0;
		float promedio = 0;
		
		Integer[] nombre = new Integer[5];
		
		for (int i = 0; i < nombre.length; i++) {
		System.out.print("Ingrese n�mero " + (i + 1) + ": ");
		nombre[i] = a.nextInt();
		
		if (nombre[i] % 2 == 0)
			numeros_pares++; 
		else
			numeros_impares++;
		
		promedio += nombre[i];
		
		}
		
		promedio /= nombre.length;
		
		System.out.println("\nCantidad de n�meros pares   : " + numeros_pares);
		System.out.println("Cantidad de n�meros impares : " + numeros_impares);
		System.out.println("Promedio de los n�meros     : " + promedio);
	}

}
