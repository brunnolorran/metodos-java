import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número
inteiro fornecido pelo usuário.
Ex.: 5! = 120
*/

public class Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que queira o fatorial: ");
        int fatorial = scan.nextInt();

        int contador = fatorial;
        int resultadoFatorial = 1;

        while (contador > 0) {
            resultadoFatorial = resultadoFatorial * contador;
            contador--;
        }

        System.out.println(fatorial + "!= " + resultadoFatorial);

    }

}
