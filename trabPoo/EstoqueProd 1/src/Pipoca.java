import java.util.ArrayList;
import java.util.List;

public class Pipoca extends Produto{

    //Atributos da subclasse
    public static int qtdPipoca;


    //Lista da sessão
    public static List<String> pipocas = new ArrayList<>();


    //Construtor da subclasse
    public Pipoca(int codProd, String nomeProd, double valorVenda) {
        super(codProd, nomeProd, valorVenda);
        qtdPipoca++;
        pipocas.add(nomeProd);
    }


    //Get e set
    public static int getQtdPipoca() {
        return qtdPipoca;
    }

    public static void setQtdPipoca(int qtdPipoca) {
        Pipoca.qtdPipoca = qtdPipoca;
    }


    //Métodos auxiliares da subclasse

    //1. Imprimir informações do produto
    public void imprimir(){
        System.out.println(
                "Pipoca: " + this.getNomeProd()
                        + ", tem o código: " + this.getCodProd()
                        + ", e valor de: R$" + this.getValor()
        );
    }

    //2. Imprimir informações da sessão
    public static void imprimirRelatorioPipoca(){
        System.out.println("Pipocas em estoque (" + qtdPipoca + "): " + pipocas);
    }
}
