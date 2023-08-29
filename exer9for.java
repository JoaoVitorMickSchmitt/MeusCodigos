import java.util.Scanner;

public class exer9for {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double somaM = 0;
		int contadorM = 0;
		int contador = 0;
		double alturaM = 0;
		double somaTodos = 0;

		System.out.println("Qual é sua altura? ");
		double altura = input.nextDouble();

		System.out.println("Qual é o seu sexo? ");
		char sexo = input.next().charAt(0);
		sexo = Character.toUpperCase(sexo);
		while (altura != 0) {

			if (sexo == 'F') {
				somaM = altura + somaM;
				contadorM++;
			}

			if (sexo == 'F' || sexo == 'M') {
				contador++;
				somaTodos = altura + somaTodos;
			}

			System.out.println("Qual é sua altura? ");
			altura = input.nextDouble();
			if (altura == 0) {
				break;
			}
			System.out.println("Qual é o seu sexo? ");
			sexo = input.next().charAt(0);
			sexo = Character.toUpperCase(sexo);
		}
		double mediaTodos = somaTodos / contador;
		double mediaM = somaM / contadorM;
		System.out.println("A média da altura das mulheres é: " + mediaM);
		System.out.println("A média da altura de todos é: " + mediaTodos);
	}

}