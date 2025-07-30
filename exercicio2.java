/*   1. Soma de dois números naturais, através de incrementos sucessivos 
(Ex.: 3 + 2 = + + (+ + + 1)).
*/

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int soma1;
        int soma2;

        System.out.println("Digite o primeiro valor da soma: ");
        soma1 = kb.nextInt();
        System.out.println("Digite o segundo valor da soma:  ");
        soma2 = kb.nextInt();

        int resultado;
        
        for(int i = soma2; i>-1; i--){
            resultado = soma1 + soma2;
            System.out.println("Número: " + soma1);
            System.out.println("Número: " + soma2);
            System.out.println("Resultado:" + resultado);

            soma1++;
            soma2--;
        }
    }
}
