import java.util.Scanner;

public class exer3for {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <= 5; i++) {
			System.out.println("Digite um n�mero entre 0 e 1000");
			int numero = input.nextInt();
			
			if (numero >=0 && numero <=1000) {
				System.out.println("Seu n�mero �: " +numero);
			} else {
				System.out.println("Entre com um n�mero de 0 a 1000");
			}
			
		}
	
	}

}