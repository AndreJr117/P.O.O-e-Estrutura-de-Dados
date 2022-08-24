package Pacote1;

public class Quest9 {
    public static void main(String[] args) {
        String NomeV = "Andre";
        double Vsal = 1700;
        double Vendas = 1230.50;
        double Sal = Vsal + Vendas * 15/100;
        System.out.println(String.format("TOTAL = R$ %.2f",Sal));
    }
}
