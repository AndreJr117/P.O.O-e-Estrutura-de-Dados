package PacoteAtt2;

import java.util.Scanner;

public class Quest8 {
    private static Object i;

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int AN = 0;
        int PA = 0;

        System.out.println("Digite um valor para N: ");
        N = sc.nextInt();

        for (int i = 0; i <= N; i++){
            AN = 1 + (i-1)*2;
            System.out.println(AN);
            PA = PA + AN;
        }

        System.out.println(PA);

    }
}