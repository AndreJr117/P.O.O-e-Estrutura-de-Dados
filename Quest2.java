//2) Desenvolver um algoritmo que leia a altura de 15 pessoas. Este programa deverá calcular e
//        mostrar :
//        a. A menor altura do grupo;
//        b. A maior altura do grupo;

package PacoteAtt2;

import java.util.Scanner;

import static java.util.Scanner.*;

public class Quest2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double AltMaior = Double.MIN_VALUE;
        double AltMenor = Double.MAX_VALUE;
        for (int i=0; i < 15; i++){
            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();

            if (AltMaior < altura) {
                AltMaior = altura;
            }

            if (AltMenor > altura){
                AltMenor = altura;
            }
        }

        System.out.println("O maior integrante tem altura: " +AltMaior);
        System.out.println("O menor integrante tem altura: " +AltMenor);

    }

}
