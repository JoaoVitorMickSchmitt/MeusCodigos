import java.util.Scanner;

public class ifnojava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroInscricao;
        double altura;
        int maisAltoNumero = 0;
        double maisAltoAltura = Double.MIN_VALUE;
        int maisBaixoNumero = 0;
        double maisBaixoAltura = Double.MAX_VALUE;
        double somaAlturas = 0;
        int quantidadeAtletas = 0;

        while (true) {
            System.out.print("Digite o n�mero de inscri��o (ou 0 para sair): ");
            numeroInscricao = scanner.nextInt();

            if (numeroInscricao == 0) {
                break;
            }

            System.out.print("Digite a altura do atleta: ");
            altura = scanner.nextDouble();

            // Atualizar atleta mais alto
            if (altura > maisAltoAltura) {
                maisAltoNumero = numeroInscricao;
                maisAltoAltura = altura;
            }

            // Atualizar atleta mais baixo
            if (altura < maisBaixoAltura) {
                maisBaixoNumero = numeroInscricao;
                maisBaixoAltura = altura;
            }

            somaAlturas += altura;
            quantidadeAtletas++;
        }

        double alturaMedia = somaAlturas / quantidadeAtletas;

        System.out.println("\nAtleta mais alto:");
        System.out.println("N�mero de inscri��o: " + maisAltoNumero);
        System.out.println("Altura: " + maisAltoAltura);

        System.out.println("\nAtleta mais baixo:");
        System.out.println("N�mero de inscri��o: " + maisBaixoNumero);
        System.out.println("Altura: " + maisBaixoAltura);

        System.out.println("\nAltura m�dia do grupo: " + alturaMedia);

        scanner.close();
    }
}