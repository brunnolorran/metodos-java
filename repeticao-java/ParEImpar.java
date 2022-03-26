import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares.
*/
public class ParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidade = 0;
        int contador = 0;
        int numero = 0;
        int par = 0;
        int impar = 0;

        System.out.println("Escolha uma quantidade máxima de números que queira digitar: ");
        quantidade = scan.nextInt();

        while (contador < quantidade) {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            contador++;
        }

        System.out.println("Tem um total de números pares: " + par);
        System.out.println("Tem um total de números impares: " + impar);

    }
}
