package ejercicios;

import java.util.Scanner;

public class Ejercicio_7_horas {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int horasTotales,semanas,dias,horas;
		
		System.out.println("Escribe el n�mero de horas: ");
		
		horasTotales = entrada.nextInt();
		
		semanas = horasTotales/168;
				
		dias = horasTotales%168 /24;
		
		horas = horasTotales%24;
		
		System.out.println(+semanas+" semanas, "+dias+" d�as, "+horas+" horas");	
		
	}
}
