import java.util.Scanner;

public class exer8sesenao {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler o ano de nascimento
		// de 3 irm�os, escrever uma
		// mensagem que indique se eles s�o TRIG�MEOS, G�MEOS,
		// APENAS IRM�OS.
		// Considere que eles s�o G�MEOS se dois deles possuem
		// a mesma idade e o outro
		// diferente dos demais, e apenas irm�os se todas as
		// idades forem diferentes.

		Scanner input = new Scanner(System.in);

		System.out.println("escreva o ano de nascimento do 1 irm�o");
		int idade1 = input.nextInt();

		System.out.println("escreva o ano de nascimento do 2 irm�o");
		int idade2 = input.nextInt();

		System.out.println("escreva o ano de nascimento do 3 irm�o");
		int idade3 = input.nextInt();

		if (idade1 == idade2 && idade1 == idade3 && idade2 == idade3)
			System.out.println("eles s�o trigemeos");
		
		else if (idade1 == idade2 || idade1 == idade3)
			System.out.println("eles s�o g�meos");

		else if (idade2 == idade3)
			System.out.println("eles s�o g�meos");


		else if (idade1 != idade2 && idade1 != idade3 && idade2 != idade3)
			System.out.println("s�o irmaos");

		
		else {System.out.println("errado");
	}

}
}
