import java.text.DecimalFormat;
import java.util.Scanner;

public class exer7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
	
		System.out.println("quantos d�lares foram entregues");
		double dolares = input.nextInt();
		
		double reais = dolares * 4.98 ; 
		System.out.println("ent�o a atendente entregou "+df.format(reais)+" reais");

		
		
	}

}
