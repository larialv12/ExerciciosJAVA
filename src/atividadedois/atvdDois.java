package atividadedois;

import java.util.Scanner;

public class atvdDois {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1,nota2,nota3,nota4;
		
		System.out.println("Digite sua nota 1:");
		
		
	  nota1 = leia.nextFloat();
	  
		System.out.println("Digite sua nota 2:");
		
		  nota2 = leia.nextFloat();
		  
			System.out.println("Digite sua nota 3:");
			
			
			  nota3 = leia.nextFloat();
			  
				System.out.println("Digite sua nota 4:");
				nota4 = leia.nextFloat();

			  
			  
             float mediaTotal;
	    
	    mediaTotal = ((nota1 + nota2 + nota3 + nota4)/4);
	    
		System.out.printf("Sua media é " + mediaTotal);
		
		

			
			


	     

		

	  
	  
		

				
		
		

	}

}
