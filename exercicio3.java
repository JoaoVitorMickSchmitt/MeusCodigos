import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		DecimalFormat  df = new DecimalFormat("0.0");
		
		System.out.println("Nota da primeira prova: ");
		double nota1 = input.nextDouble();
		System.out.println("Nota da segunda prova: ");
		double nota2 = input.nextDouble();
		
		double nota1Peso = nota1 * 3.5;
		double nota2Peso = nota2 * 3.5;
		double media = (nota1Peso +nota2Peso) / 10;	
		
		System.out.println("A média ponderada é: " + df.format(media));
	}

}
