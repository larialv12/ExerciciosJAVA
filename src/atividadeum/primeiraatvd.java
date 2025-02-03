package atividadeum;

import java.util.Scanner;



public class primeiraatvd {
	


	public static void main(String[] args) {
		

		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salario:");
		
		float salario;
		
		salario = leia.nextFloat();

		
		
		
		System.out.println("Digite seu abono salarial:");

		
		
		
		float abono;
		
		abono = leia.nextFloat();
		
		
		float novoSalario;
		
		novoSalario = salario + abono;
		
		System.out.println("O novo salario é:" + ""  + novoSalario);
		
		
		leia.close();
		
		
		
		
		
		

		
		
		
		
		  
		

	}

}
