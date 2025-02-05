package lacoscondcionais;

import java.util.Scanner;


public class Exercicioum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("1 - Cachorro Quente.........................R$10,00");
		System.out.println("2 - X-Salada................................R$15,00");
		System.out.println("3 - X-Bacon.................................R$18,00");
		System.out.println("4 - Bauru...................................R$12,00");
		System.out.println("5 - Refrigerante.............................R$8,00");
		System.out.println("6 - Suco de laranja.........................R$13,00");
		
		
        int codigo,quantidade;
		System.out.println("Digite o codigo do produto:");
		codigo = leia.nextInt();
         System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		String produto;
		double preco,valorTotal;
		
		
    switch(codigo) {
		case 1 :
			produto = "Cachorro quente";
			preco = 10.00;
			valorTotal = quantidade * preco;
			System.out.println("Produto:" + "\s" +  produto + "\s|\s" +  "valorTotal:" + "\s" + "R$ " +    valorTotal+"0");

           break;
			
		case 2:
			produto = "X-Salada";
			preco = 15.00;
			valorTotal = quantidade * preco;
			System.out.println("Produto:" + "\s" +  produto + "\s|\s" +  "valorTotal:" + "\s" + "R$ "   +  valorTotal+"0");



			
			break;
			
		case 3:
			
			produto = "X-Bacon";
			preco = 18.00;
			valorTotal = quantidade * preco;
			System.out.println("Produto:" + "\s" +  produto + "\s|\s" +  "valorTotal:" + "\s" + "R$ "   +  valorTotal+"0");


			
			break;
			
		case 4 :
			produto = "Bauru";
			preco = 12.00;
			valorTotal = quantidade * preco;
			System.out.println("Produto:" + "\s" +  produto + "\s|\s" +  "valorTotal:" + "\s" + "R$ "  +  valorTotal+"0");



			
		break;
		
		case 5 :
			produto = "Refrigerante";
			preco = 8.00;
			valorTotal = quantidade * preco;
			System.out.println("Produto:" + "\s" +  produto + "\s|\s" +  "valorTotal:" + "\s" + "R$ "  +  valorTotal+"0");


			
			break;
			
		case 6:
			
			produto = "Suco de laranja";
			
			preco = 13.00;
			valorTotal = quantidade * preco;
			System.out.println("Produto:" + "\s" +  produto + "\s|\s" +  "valorTotal:" + "\s" + "R$ "   +  valorTotal+"0");


			
			break;
			
		default :
			
			System.out.println("Codigo de produto invalido!!");
			

		}
		

			
		
		
		
		
		
		
		
		


		




		
		

	}
		
		

	}


