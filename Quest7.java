package PacoteAtt2;

import java.util.Scanner;

public class Quest7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = 0;

        while (Num <= (1)){
            System.out.println("Digite um numero de 0 a 10: ");
            Num = sc.nextInt();
            }
        for (int i = 0; i <= 10; i++){
        System.out.println (i+" x "+ Num + " = " + i*Num);
        }

        }
    }
