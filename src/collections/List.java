package collections;

import java.util.Scanner ;


import java.util.ArrayList;


public class List {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		
		int contador;
		
		String corUsuario;
		
		Scanner leia = new Scanner(System.in);

		
		for(contador = 1; contador < 6; contador++) {

	 		System.out.println("Digite a cor");
	   		 corUsuario = leia.nextLine();

 	        cores.add(corUsuario);
 	        
 	        
 	        if(contador == 5) {
 	        	
 	        	for(String cor : cores) {
 	        		System.out.println(  "\n Cor:"+ cor  );
 	        		
 	        		

 	        		}
 	        	
 	        	cores.sort(null);
 	        	
 	        	for(String corOrdenada : cores) {
 	        		

 	        		System.out.println( "\n Cores Ordenadas:"+ corOrdenada);

 	        		
 	        		
 	        	}

 	        	 
 	        	
 	        	

 		}	
 	       


			
	 		
	 }
		
		
		
		
	
				
		
		  
				
		 	//	System.out.println("Todas as cores:"  +  String.join(", ", cores));
		 		
		 		
		 	//	cores.sort(null);
		 	//	System.out.println("Cores ordenadas:"  +  String.join(", ", cores));
		 		
		 		

		 		

			
			
			
			
			
			
           

			
			
     
			
			
		
		
		
		


	}

}