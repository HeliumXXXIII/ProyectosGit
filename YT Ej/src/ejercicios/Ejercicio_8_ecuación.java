package ejercicios;

import java.util.Scanner;

public class Ejercicio_8_ecuación {
	

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double A,B,C,operacionMas,operacionMenos;
		
		System.out.println("Escribe A");
		
		A = entrada.nextDouble();
		
		System.out.println("Escribe B");
		
		B = entrada.nextDouble();
		
		System.out.println("Escribe C");
		
		C = entrada.nextDouble();
		
		operacionMas = (-B + (Math.sqrt(Math.pow(B, 2) - 4*A*C))) / 2*A;
		
		operacionMenos = (-B - (Math.sqrt(Math.pow(B, 2) - 4*A*C))) / 2*A;
		
		System.out.println("El resultado de X es igual a "+operacionMas+" y "+operacionMenos);
	}
}



