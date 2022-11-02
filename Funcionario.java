public class Funcionario {

    private final Double PERCENTUAL_CUSTO = 1.8;
    private String nome;
    private double custo;
    private double salario;

    public double getCusto(){
        return custo;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        this.custo = salario * PERCENTUAL_CUSTO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("Olá meu nome é: "
        +this.nome+ " .eu recebo "
        +this.salario+ " de salário."
        + " E tenho um custo de " + this.custo+ " Para a empresa." );
    }


}
