package ejercicios;

import java.util.Scanner;

public class Ejercicio_3_dinero {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	float guillermo,luis,juan,total;
	
		System.out.println("Escriba la cantidad de dinero que tiene Guillermo");
	
	guillermo = entrada.nextFloat();
	
	luis = guillermo/2;
	
		System.out.println("Luis tiene: "+luis);
	
	juan = (luis+guillermo)/2;
	
		System.out.println("Juan tiene: "+juan);
	
	total = guillermo+luis+juan;
	
		System.out.println("\nEl total de dinero es: "+total+"€");
	}
}