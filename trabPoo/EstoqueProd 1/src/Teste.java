import java.util.ArrayList;
import java.util.List;

public class Teste {
    private static List<Biscoito> biscoitos= new ArrayList<>();
    public static void main(String[] args) {



        Teste.biscoitos.add(new Biscoito(1, "Treloso 130g", 1.99));
        Teste.biscoitos.add(new Biscoito(2, "Bono 100g", 4.99));
        Teste.biscoitos.add(new Biscoito(3, "Futurinhos 130g", 1.99));
    }

}
