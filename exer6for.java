import java.util.Scanner;

public class exer6for {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double maisAltoNumero = 0;
		double maisAlto = Integer.MIN_VALUE;
		double maisBaixoNumero = 0;
		double maisBaixo = Integer.MAX_VALUE;;

		int contador = 0;
		double somaaltura = 0;
		System.out.println("escreva a altura dos atletas");
		int altura = input.nextInt();
		System.out.println("qual o numero de inscri��o?");
		int inscricao = input.nextInt();
		while (inscricao != 0) {
			contador++;
			somaaltura = somaaltura + altura;

			if (altura > maisAlto) {
				maisAltoNumero = inscricao;
				maisAlto = altura;
			}

			if (altura < maisBaixo) {
				maisBaixoNumero = inscricao;
				maisBaixo = altura;
			}
			System.out.println("escreva a altura dos atletas");
			altura = input.nextInt();
			System.out.println("qual o numero de inscri��o?");

			inscricao = input.nextInt();

		}
		double medialtura = somaaltura / contador;

		System.out.println("a media sera " + medialtura);
		System.out.println(" � pessoa mais alta � " + maisAlto + " com o numero de inscri��o " + maisAltoNumero);
		System.out.println(" � pessoa mais baixa � " + maisBaixo + " com o numero de inscri��o " + maisBaixoNumero);

	}

}
