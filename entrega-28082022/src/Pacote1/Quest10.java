package Pacote1;

public class Quest10 {
    public static void main(String[] args) {

        int Cod1 = 12;
        int Num1 = 1;
        double Valp1 = 5.30;
        int Cod2 = 16;
        int Num2= 2;
        double Valp2 = 5.10;
        double Val = Valp1 + Valp2*2;


        System.out.println(String.format("VALOR A PAGAR: R$ %.2f",Val));
    }
}
