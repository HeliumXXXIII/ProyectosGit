package ejercicios;

import java.util.Scanner;

public class Ejercicio_1_suma {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	float nota1,nota2,nota3,suma;
	
		System.out.print("Escribe 3 n�meros: ");
		
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		nota3 = entrada.nextFloat();
		
		suma = nota1+nota2+nota3;
		
		System.out.print("La suma total es: "+suma);
	}
}
