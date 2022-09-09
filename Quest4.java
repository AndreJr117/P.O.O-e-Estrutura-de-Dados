package PacoteAtt2;

import javax.swing.*;
import java.util.Scanner;

public class Quest4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Num = 0;
        int Qtd1 = 0;
        int Qtd2 = 0;
        int Qtd3 = 0;
        int Qtd4 = 0;
        int QtdFint = 0;

        while (Num != (-1)) {
            System.out.println("Informe um numero");
            Num = sc.nextInt();

            if ((Num <= 0) || (Num > 100)) {
                QtdFint = QtdFint + 1;
            } else {
                if ((Num >= 0) && (Num <= 25)) {
                    Qtd1 = Qtd1 + 1;
                }

                if ((Num >= 26) && (Num <= 50)) {
                    Qtd2 = Qtd2 + 1;
                }

                if ((Num >= 51) && (Num <= 75)) {
                    Qtd3 = Qtd3 + 1;
                }

                if ((Num >= 76) && (Num <= 100)) {
                    Qtd4 = Qtd4 + 1;
                }
            }

        }

        System.out.println("Quantidade de números no intervalo de 0 a 25, é de " + Qtd1);
        System.out.println("Quantidade de números no intervalo de 25 a 50, é de " + Qtd2);
        System.out.println("Quantidade de números no intervalo de 50 a 75, é de " + Qtd3);
        System.out.println("Quantidade de números no intervalo de 75 a 100, é de " + Qtd4);
        System.out.println("Quantidade de números fora do intervalo, é de " + QtdFint);


    }
    }
