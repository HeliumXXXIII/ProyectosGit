package ejercicios;

import java.util.Scanner;

public class Ejercicio_6_cuadradosuma {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double A,B,operacion;
		
		System.out.println("Escribe A");
		
		A = entrada.nextDouble();
		
		System.out.println("Escribe B");
		
		B = entrada.nextDouble();
		
		operacion = Math.pow(A, 2) + Math.pow(B, 2) + 2*A*B;
		
		System.out.println("El resultado de (a+b)^2 es: "+operacion);
		
		

}
	}
