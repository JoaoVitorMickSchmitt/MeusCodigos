import java.util.Scanner;

public class exer10for {

	public static void main(String[] args) {
		

		//Uma turma tem n alunos.
		//Dado n, o nome(somente o primeiro nome) e idade de cada aluno descreva:
		//a) os nomes dos alunos que tem 18 anos; 
		//b) a quantidade de alunos que tem idade acima de 20 anos.

		Scanner input = new Scanner(System.in);
		int contador18 =0;
		int contador20 = 0;
		String nome18 = "";
		System.out.println("quantos alunos tem na sala ");
		int qtdAlunos = input.nextInt();
		
		for (int i = 0; i < qtdAlunos; i++) {
		System.out.println("qual é o nome do"+ i + " aluno : ");
		String nome = input.next();
		System.out.println("qual é a didade do "+ i +" aluno?");
		int idade = input.nextInt();
	
		if ( idade == 18) {
			nome18 = nome18 + nome +", ";
			contador18++;
					}
		if ( idade > 20) {
			contador20++;
		}
		
		
		
		}
		
		System.out.println("os alunos com 18 anos são " + nome18 );
		System.out.println("tem "+contador20+" alunos com + de 20 anos ");
		
		
	}

}
