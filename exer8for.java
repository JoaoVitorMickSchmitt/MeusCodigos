import java.util.Scanner;

public class exer8for {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int contador = 0;

		System.out.println("qual o seu nome");
		String nome = input.next();
		System.out.println("qual a sua nota?");
		int notas = input.nextInt();
		System.out.println("qual a sua SEGUNDA nota?");
		int notas2 = input.nextInt();

		while (!nome.equals("fim")) {
			double somaNota = 0;
			somaNota = somaNota + (notas + notas2);
			double mediaNotas = somaNota / 2;

			System.out.println(" a media será " + mediaNotas);

			System.out.println("qual o seu nome");
			nome = input.next();

			System.out.println("qual a sua  nota");
			notas = input.nextInt();

			System.out.println("qual a sua segunda  nota");
			notas = input.nextInt();

		}

		System.out.println("acabou o programa");

	}

}

		
		
		
		
		
		
