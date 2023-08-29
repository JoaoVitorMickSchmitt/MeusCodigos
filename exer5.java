import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		
		
		double somaAltura = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i <5; i++) {
			System.out.println("diga a altura da pessoa");
			double altura = input.nextInt();
			
		
			double	medialtura = (altura + altura +altura +altura + altura) ;
				
			
			 somaAltura= somaAltura + (altura / 5);
			
		} 
		
			System.out.println(somaAltura);
		
		

	}

}
