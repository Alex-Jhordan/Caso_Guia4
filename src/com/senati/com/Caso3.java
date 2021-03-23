package com.senati.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		Integer[] numero = new Integer[5];
		
		System.out.println("INGRESO DE NÚMEROS");
		System.out.println("==================");
		
		for (int x = 0; x < numero.length; x++) {
			System.out.print("Número " + (x + 1) + ": ");
			numero[x] = a.nextInt();
		}
		
		System.out.println("\nNúmeros ingresados");
		System.out.println("==================");
		
		for (int x = 0; x < numero.length; x++)
			System.out.println("Número " + (x + 1) + ": " + numero[x]);
		
		// ordenar en forma ascendente
		Arrays.sort(numero);
		
		System.out.println("\nNúmeros ordenados ascendentemente");
		System.out.println("=================================");
		
		for (int x = 0; x < numero.length; x++)
			System.out.println("Número " + (x + 1) + ": " + numero[x]);
		
		
		Arrays.sort(numero, Collections.reverseOrder());
		
		System.out.println("\nNúmeros ordenados descendentemente");
		System.out.println("=================================");
		
		for (int x = 0; x < numero.length; x++)
			System.out.println("Número " + (x + 1) + ": " + numero[x]);
	}

}
