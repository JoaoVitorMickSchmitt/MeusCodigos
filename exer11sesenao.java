import java.util.Scanner;

public class exer11sesenao {

	public static void main(String[] args) {
		//Escreva um algoritmo em que o usu�rio entra com um n�mero.
		//Depois ele escolhe a opera��o que vai ser feita com esse n�mero
		//Caso ele escolha a opera��o 1
		//Modifique a vari�vel do n�mero entrado e some 10 ao n�mero original
		//Caso ele escolha a opera��o 2
		//Modifique a vari�vel do n�mero entrado e subtraia 10 do n�mero original
		//Caso ele escolha a opera��o 3
		//Modifique a vari�vel do n�mero entrado e multiplique 10 ao n�mero original
		//Caso ele escolha a opera��o 4
		//Modifique a vari�vel do n�mero entrado e divida 10 do n�mero original
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("qual o numero que voce vai insirir ");
		
		int numero1 = input.nextInt();
		
		System.out.println("qual opera��o voce vai usar ?  (1 2 3  e  4 ) ");
		
		int operacao = input.nextInt();
		
		int resultado = 0;
		
		if (operacao == 1) { 
			resultado = numero1 + 10;
		} else if (operacao ==2 ) {
			resultado = numero1 - 10;
		} else if (operacao == 3) {
			resultado = numero1 * 10;
		} else if (operacao == 4) {
			resultado = numero1 / 10;
		}
		
		 System.out.println("o numero final  ser� "+ resultado );
				
			
		
		
		
		
	}

}
