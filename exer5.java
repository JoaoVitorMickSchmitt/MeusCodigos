import java.text.DecimalFormat;
import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df =new DecimalFormat("0.00");
		
		System.out.println("qual o número do Funcionário?  ");
		double numFuncionario =  input.nextDouble();
		System.out.println("Quantidade de horas?  ");
		double horasFun=  input.nextDouble();
		System.out.println("valor das horas?  ");
		double valorHora=  input.nextDouble();
		
		double qtdValor = (horasFun * valorHora);
		System.out.println("o funcionário ganha " +df.format(qtdValor)+ "e o número dele é" +df.format(numFuncionario));
	}

}
