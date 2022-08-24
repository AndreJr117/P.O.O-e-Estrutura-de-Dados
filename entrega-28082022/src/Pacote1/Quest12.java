package Pacote1;

public class Quest12 {
    public static void main(String[] args) {
        double A = 3.0;
        double B = 4.0;
        double C = 5.2;
        double Triangulo = (A * C) / 2;
        double Circulo = 3.14159 * C * C;
        double Trapezio = ((A + B) * C) / 2;
        double Quadrado = B * B;
        double Retangulo = A * B;
        System.out.println(String.format("TRIANGULO = %.3f", Triangulo));
        System.out.println(String.format("CIRCULO = %.3f", Circulo));
        System.out.println(String.format("TRAPEZIO = %.3f", Trapezio));
        System.out.println(String.format("QUADRADO = %.3f", Quadrado));
        System.out.println(String.format("RETANGULO = %.3f", Retangulo));
    }
}
