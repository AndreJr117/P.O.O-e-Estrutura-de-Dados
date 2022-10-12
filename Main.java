package atividade1;

public class Main {
    public static void main(String[] args) {

        CarroCorrida c1 = new CarroCorrida(1, "André", 0.0, 0.0, true);


        System.out.println(c1.SituacaoMotor());
        System.out.println(c1.Acelerar(20));
        System.out.println(c1.Acelerar(10));
        System.out.println(c1.Frear(10));
        System.out.println(c1.Frear(50));


    }
}
