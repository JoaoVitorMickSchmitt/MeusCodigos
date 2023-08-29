import java.util.Scanner;

public class exer4for {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int somaimpar = 0;
		int somapar= 0;
		
		
		for (int i = 0; i <=100; i++) {
			if( i % 2 !=0) {
				somaimpar = somaimpar + i; 		
				
				
			}else { somapar = somapar + i;
				
			}
		}
		System.out.println("todos os impares somados dao " + somaimpar + " todos os pares somados sao " + somapar);
		
		
		
	}
}
