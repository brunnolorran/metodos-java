import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.

*/

public class Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;

        System.out.println("Apenas números entre entre zero e dez");

        System.out.println("Digite um número: ");
        number = scan.nextInt();

        while (number < 0 | number > 10) {
            System.out.println("digite um valor válido");
            System.out.println("Digite outro número: ");
            number = scan.nextInt();
        }
    }

}
