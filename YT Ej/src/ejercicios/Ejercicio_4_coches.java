package ejercicios;

import java.util.Scanner;

public class Ejercicio_4_coches {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	double nºcoches,valorc,comision,total; 
	
	System.out.println("Escribe la cantidad de coches que has vendido");
	
	nºcoches = entrada.nextDouble();
	
	valorc = nºcoches*150;
	
	System.out.println("Valor coches: "+valorc);
	
	comision = valorc*0.05;
	
	System.out.println("Comision: "+comision);
	
	total = valorc+comision+1000;
	
	System.out.println("Este mes cobras: "+total);
	
	}
}
