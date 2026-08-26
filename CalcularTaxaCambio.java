import java.util.Scanner;

public class CalcularTaxaCambio{

    // Calcula a taxa de cambio
    public static double valorConvertido(double taxa, double real) {
     return (real * taxa);

    }

    //Solicita e mostra os valores

    public static void main (String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor em reais:   ");
        double real = leitor.nextDouble();


        System.out.println("Digite a taxa de cambio:  ");
        double taxa = leitor.nextDouble();

        double valor = valorConvertido(taxa, real);

        System.out.printf("O valor convertido e: %.2f%n ", valor);


        leitor.close();
     }
    }
