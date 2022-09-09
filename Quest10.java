package PacoteAtt2;

import java.util.Scanner;

public class Quest10 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int Numero = 0;
        int Fat = 1;

        System.out.println("Digite um numero de 1 a 10: ");
        Numero = sc.nextInt();
        if(Numero>=1) {
            for (int i = 1; i <= Numero; i++) {
                Fat = Fat * i;
                System.out.println("O fatorial de " + Numero + " é igual a " + Fat);
            }
        }
    }
}