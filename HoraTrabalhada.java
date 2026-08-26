import java.util.Scanner;

public class HoraTrabalhada{
    //Calculo de horas trabalhadas
    public static double somatorioSalario(double valorHora, double horasTrabalhadas){
        return(valorHora * horasTrabalhadas);

    }
    //Solicita e mostra os valores

    public static void main (String[] args){
        Scanner leitor= new Scanner(System.in);
        System.out.println("Digite o valor da hora de trabalho:      ");
        double valorHora = leitor.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas:   ");
        double horasTrabalhadas = leitor.nextDouble();

        double salario = somatorioSalario(valorHora , horasTrabalhadas);

        System.out.printf("Seu salario esse mes é:  %.2f%n  ", salario);

        leitor.close();




    }
}
