package lacosderepeticao;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner leia = new Scanner(System.in);

        int numeroInteiro, par, impar;
        par = 0;
        impar = 0;

        for (int count = 1 ; count < 11 ; count++) {
             System.out.println("Digite o número " + count + ":");
             numeroInteiro = leia.nextInt();
           if (numeroInteiro % 2 == 0) {
               par++;
           } else {
               impar++;
           }

        
    } 
        System.out.println("Total de números pares: " + par);
        System.out.println("Total de números ímpares: " + impar);
    
    

            	
            	
            	
                

            	
            	
            	
            	
            

            
       
    
}
    }
    
    
    
