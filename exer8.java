import java.text.DecimalFormat;
import java.util.Scanner;

public class exer8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("qual � o valor A");
		double valorA = input.nextDouble();
		
		System.out.println("qual � o valor B");
		double valorB = input.nextDouble();
		
		System.out.println("qual � o valor C");
		double valorC = input.nextDouble();
		
		double areaDoTriangulo = (valorA * valorC) /2 ;
		System.out.println("Quest�o A) A �rea do triangulo retangulo ser� : "+ df.format(areaDoTriangulo));
		 
		double areaDoCirculo = (valorC * valorC) / Math.PI;
		System.out.println("b) a �rea do c�rculo de raio C ser�:  " +df.format(areaDoCirculo));
		
		double areaDoTrapezio = ((valorA + valorB) * valorC) /2;
		System.out.println("c) a �rea do trap�zio �: "+df.format(areaDoTrapezio));
		
		double areaDoQuadrado = (valorB * valorB);
		System.out.println("d) a �rea do quadrado �: "+df.format(areaDoQuadrado));
		
		double areaDoRetangulo = (valorA * valorB);
		System.out.println("e) a �rea do ret�ngulo �: "+ df.format(areaDoRetangulo));
		
	}

}
