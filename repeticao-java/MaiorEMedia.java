import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números

*/

public class MaiorEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maior = 0;
        int total = 0;
        int numero;
        int contador = 0;

        while (contador < 5) {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            total = total + numero;
            contador++;
        }

        double media = total / 5;

        System.out.println("O maior número digitado: " + maior);
        System.out.println("Total: " + total);
        System.out.println("A média dos números: " + media);

    }

}
