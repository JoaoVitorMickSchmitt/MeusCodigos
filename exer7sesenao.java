import java.util.Scanner;

public class exer7sesenao {

	public static void main(String[] args) {

		// Dadas as coordenadas (X e Y) de um Ponto,
		// voc� deve informar em qual quadrante ele est� localizado

		Scanner input = new Scanner(System.in);

		System.out.println("de as cordenadas de x: ");
		int x = input.nextInt();

		System.out.println("de as cordenadas de y: ");
		int y = input.nextInt();

		if (x > 0 && y > 0) {
			System.out.println("ele estar� no primeiro quadrante");

		}else if (x < 0 && y > 0) {
				System.out.println("ele estar� no segundo quadrante");
				
			}else if (x > 0 && y < 0) {
				System.out.println("ele estar� no quarto quadrante");
					
			}	else if (x < 0 && y < 0) {
						System.out.println("ele estar� no terceiro quadrante");
			
			}	else {System.out.println("numero invalido");
							
						}
			
		}

	}


