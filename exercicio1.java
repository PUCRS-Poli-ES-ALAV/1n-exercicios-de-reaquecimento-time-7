/*
 * Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
*/

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int numero;
        int nDeMulti;
        int aux;

        System.out.println("Digite o numero de vezes que sera somado o numero");
        Scanner kb = new Scanner(System.in);
        nDeMulti = kb.nextInt();
        System.out.println("Digite o numero");
        numero = kb.nextInt();
        aux = numero;

        for (int i = 0; i < nDeMulti; i++) {
            numero += aux;
            System.out.println(numero);
        }
    }
}