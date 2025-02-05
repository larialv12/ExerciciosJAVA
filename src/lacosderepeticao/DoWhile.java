package lacosderepeticao;
import java.util.Scanner;



public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		Scanner leia = new Scanner(System.in);
		
		int numero ;
		
		int positivo = 0 ;
		
		
		
		do {
     		System.out.println("Digite um numero");


    		numero = leia.nextInt();

          
        	  
        	if(numero > 0) {
        		positivo = numero + positivo;
        	}

        	  
        	  

         
        	  
        	  
          
       		
        	 
        	  
        	  
        	  
        	  
        	  
          } while(numero != 0 );
       		System.out.println("A soma dos numeros positivos " + positivo  );

			
			
			
			
		
	
		
		
		

	}

}
