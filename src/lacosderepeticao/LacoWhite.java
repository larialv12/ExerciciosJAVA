package lacosderepeticao;

import java.util.Scanner;


public class LacoWhite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
         int idade;
         
         
         int menor = 0;
         int maior = 0;
         
         while( true ) {
        	 
     		System.out.println("Digite idade ou um numero negativo para sair:");
            idade = leia.nextInt();
             
            if(idade<0) {
            	
         		System.out.println("Progama finalizado");
         		break;
         		
         		

            	
            	
            }if(idade<=21){
            	
            	menor++;
            }if(idade>=50) {
            	maior++;
            }

     		

        	 
        	 
        	 
         }     		System.out.println("Total de pessoas menores de 21 anos:  " + menor);
  		         System.out.println("Total de pessoas menores de 50 anos:" + maior);

         

	}

}
