import java.text.DecimalFormat;
import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df =new DecimalFormat("0.00");
		
		System.out.println("qual o n�mero do Funcion�rio?  ");
		double numFuncionario =  input.nextDouble();
		System.out.println("Quantidade de horas?  ");
		double horasFun=  input.nextDouble();
		System.out.println("valor das horas?  ");
		double valorHora=  input.nextDouble();
		
		double qtdValor = (horasFun * valorHora);
		System.out.println("o funcion�rio ganha " +df.format(qtdValor)+ "e o n�mero dele �" +df.format(numFuncionario));
	}

}
