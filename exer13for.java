import java.util.Scanner;

public class exer13for {

	private static final String String = null;

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
	//	Descreva um algoritmo que leia n números inteiros e até o usuário entrar com a letra n
	//	a) escreva o menor valor 
	//	b) escreva o maior valor

		
		
		
		int numeroMaior = Integer.MIN_VALUE;
		int numeroMenor = Integer.MAX_VALUE;
		int contador = 0;
		
		System.out.println("digite algum numero ");
		String numero = input.next();
		
		while(!numero.equals("n")){		
			 contador++;
			int numeros = Integer.valueOf(numero);
			
			if( numeros > numeroMaior) {
				numeroMaior = numeros;
			}
			if (numeros < numeroMenor) {
				numeroMenor = numeros;
				
			}
			
			
			System.out.println("digite algum numero");
			numero = input.next();

			
		}
		
		if (contador == 0 ) { System.out.println("nao houve entrada no programa");
		
		}	else {
			System.out.println("fim do prgrama");
			System.out.println("o numero mair é " +numeroMaior);
			System.out.println(" o numero menor é " +numeroMenor);
			
		}
		

	}

}
