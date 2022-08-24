package Pacote1;

import static java.lang.Math.abs;

public class Quest13 {
    public static void main(String[] args) {
        int A = 7;
        int B = 14;
        int C = 106;
        int MaiorAB = (A + B + abs(A - B)) / 2;
        int MaiorABC = (MaiorAB + C + abs(MaiorAB-C))/2;

        System.out.println(String.format(MaiorABC + " eh o maior"));

    }


}
