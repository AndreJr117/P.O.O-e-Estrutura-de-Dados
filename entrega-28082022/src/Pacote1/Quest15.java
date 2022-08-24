package Pacote1;

import static java.lang.Math.sqrt;

public class Quest15 {
    public static void main(String[] args) {

        double X1 = -2.5;
        double Y1 = 0.4;
        double X2 = 12.1;
        double Y2 = 7.3;
        double Result = sqrt((X2-X1)*(X2-X1) + (Y1-Y2)*(Y1-Y2));


        System.out.println(String.format("%.4f", Result));

    }
}
