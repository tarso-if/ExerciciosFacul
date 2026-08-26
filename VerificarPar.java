import java.util.Scanner;

public class VerificarPar{

    public static boolean verificarPar(int  numero) {

        if (numero % 2.00!=0) {
            System.out.println("Esse numero " + numero + " e impar");
            return false;
        } else {
            System.out.println("Esse numero  " + numero +  "  e par");


            return true;
        }


    } public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Descubra se o número é par, digite um numero:   ");
        int calculo = leitor.nextInt();
        boolean resultado = verificarPar(calculo);

    }
}
