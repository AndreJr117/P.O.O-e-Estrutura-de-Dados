package PacoteAtt2;
import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Soma = 0;
        int Cont = 0;
        int MedArit = 0;
        int QtdPos = 0;
        int QtdNeg = 0;
        int PorcPos;
        int PorcNeg;
        int Val1 = 0;

        while (Val1 <= Cont){
            System.out.println("Informe um numero positivo ou negativo: ");
            Val1 = sc.nextInt();

            if (Val1 > (0)){
                Soma = Soma + Val1;
                Cont = Cont + 1;

                if (Val1 < 0){
                    QtdNeg = QtdNeg + 1;
                } else {
                    QtdPos = QtdPos + 1;
                }
            }
        }

        MedArit = Soma / Cont;
        PorcPos = QtdPos * 100 / Cont;
        PorcNeg = QtdNeg * 100 / Cont;


        System.out.println("A média aritimética é: " + MedArit);
        System.out.println("A quantidade de numeros positivos é: " + QtdPos);
        System.out.println("A quantidade de numeros negativos é: " + QtdNeg);
        System.out.println("O percentual de positivo é: " + PorcPos);
        System.out.println("O percentual de negativo é: " + PorcNeg);




    }

}
