package PacoteAtt2;

import java.text.BreakIterator;
import java.util.Scanner;

public class Quest5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Num = 0;
        int Cont = 0;
        int QtdPar = 0;
        int QtdImp = 0;
        double MediaPar ;
        double MediaG ;

        while (Num <= Cont ){
            System.out.println("Digite um numero inteiro: ");
            Num = sc.nextInt();


            if (Num > (0)){
                Cont = Num + 1;
            }
            if (Num == (0)){
                break;
            }

                if (Num % 2 == 0 ){
                    QtdPar = QtdPar + 1;
                    Cont = Cont + 1;
            } if ( Num % 2 == 1 ){
                    QtdImp = QtdImp + 1;
                    Cont = Cont +1;
                }
            }

        MediaPar = QtdPar % Cont ;
        MediaG = (QtdPar + QtdImp) % Cont ;

        System.out.println("A Quantidade de par é: " + QtdPar);
        System.out.println("A Quantidade impar é: " + QtdImp);
        System.out.println("A média par é: " + MediaPar);
        System.out.println("A média geral é: " + MediaG);


        }
    }

