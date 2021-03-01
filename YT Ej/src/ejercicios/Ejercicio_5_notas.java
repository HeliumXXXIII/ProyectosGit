package ejercicios;

import java.util.Scanner;

public class Ejercicio_5_notas {
	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		double comp,exp,exp2,exf,total;
		
			System.out.println("Escribe la nota de comportamiento");
		
		comp = entrada.nextDouble();
		
			System.out.println("Escribe la nota del primer examen parcial");
		
		exp = entrada.nextDouble();
		
			System.out.println("Escribe la nota del segundo examen parcial");
		
		exp2 = entrada.nextDouble();
		
			System.out.println("Escribe la nota del examen final");
		
		exf = entrada.nextDouble();
		
		comp = comp*0.1;
		
		exp = exp*0.25;
		
		exp2 = exp2*0.25;
		
		exf = exf*0.4;
		
		total = comp+exp+exp2+exf;
		
		System.out.println("La nota final del trimestre es: "+total);
		
}
	}