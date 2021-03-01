package ejercicios;

import java.util.Scanner;

public class Ejercicio_2_salario {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	float SalarioporHora,horas,SalarioSemanal;
	
		System.out.print("Escribe tu salario por hora ");
		
			SalarioporHora = entrada.nextFloat();
		
		System.out.print("Escribe las horas semanales ");
		
			horas = entrada.nextFloat();
		
			SalarioSemanal = SalarioporHora*horas;
		
		System.out.print("Tu salario semanal sería de "+SalarioSemanal+"€");
	}
}
