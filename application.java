public class application {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("David");
        funcionario.setSalario(1000);
        funcionario.imprimir();

        Programador programador = new Programador();
        programador.setNome("Daivid Programador");
        programador.setSalario(100000);
        programador.imprimir();


        Gerente gerente = new Gerente();
        gerente.setNome("Gerente doido");
        gerente.setSalario(999999);
        gerente.imprimir();

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("secretaria jully");
        secretaria.setSalario(1200);
        secretaria.setAgenda("Seg - sala 1, terça - sala 2.");
        secretaria.imprimir();

        Analista analista = new Analista();
        analista.setNome("AndreJr");
        analista.setSalario(1999);
        analista.imprimir();



    }
}
