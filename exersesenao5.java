import java.util.Scanner;

public class exersesenao5 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		//Fa�a um algoritmo que leia um caractere.
		//Caso seja digitada a letra 'M' escreva �Masculino�.
		//Se for digitada a letra 'F' escreva �Feminino�.
		//Se for informado 'I' escreva �N�o Informado�.
		//Qualquer outra letra digitada escreva �Entrada Incorreta�.

		 
		 System.out.println("qual � o caracter? ");
		 char genero = input.next().charAt(0);
		 genero = Character.toUpperCase(genero);
		 if (genero == 'M' )
		 System.out.println("o genero � masculino");
		 else if (genero == 'F' )
		 System.out.println("o genero � feminino");
		 else if (genero == 'I' )
		 System.out.println("o genero N�o foi informado");
		 
		 else {System.out.println("Entrada Incorreta");
			
		}
		 
	}

}
