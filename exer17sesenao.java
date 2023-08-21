import java.text.DecimalFormat;
import java.util.Scanner;

public class exer17sesenao {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		
	
		
		
		System.out.println("quantas horas esse mes voce trabalhou");
		 double horasMes = input.nextInt();
		 
		 System.out.println("quanto voce ganha por hora?");
		 int valorHora = input.nextInt();
		 
		 
		 double acrecismo = 400 - horasMes;
		 
		 double acrescimoTotal = (acrecismo * valorHora) * 0.5;
		 
		 System.out.println("o seu salario final sera "+ acrescimoTotal );
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
