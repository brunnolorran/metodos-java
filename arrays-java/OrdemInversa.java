/*
Clie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = { 0, -6, 15, 8, 4, 50 };

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i]);
        }

    }

}
