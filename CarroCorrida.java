package atividade1;

public class CarroCorrida {
    private int NumeroCarro;
    private String Piloto;
    private Double VelMax;
    private Double VelMin;
    private boolean Ligado;


    public String Frear(int valor){
        if(Ligado==false){
            return "Carro está desligado ! o carro está parado.";
        }
        if(VelMax==0.0){
            return "O carro está parado";
        }
        if(VelMax - valor < 0.0){
            VelMax = 0.0;
            return "Freou, o carro está parado";
        } return "Freou, velocidade atual: " + VelMax + "Km/h.";



    }

    public String Acelerar(int Valor){
        if (Ligado == true){
            VelMax = VelMax + Valor;
            return "Acelerou, velocidade atual: " + VelMax +"Km/h.";
        }
        return "Não é possivel acelerar com motor desligado.";
    }


    public String DesligarMotor(){
        if(Ligado==false){
            return "O motor já está desligado.";
        }
        if(VelMax==0.0) {
            Ligado = false;
            return "O motor foi desligado agora.";
        }
        return "O motor não foi desligado pois o carro está em movimento.";
    }



    public String LigarMotor(){
        if(Ligado==true){
            return "O carro já está ligado.";
        }
        return  "O Carro foi ligado.";
    }
    public String SituacaoMotor(){

        if(Ligado == true){
            return "Motor Ligado";
        } else{
            return "Motor Desligado";
        }
    }



    public CarroCorrida(int numeroCarro, String piloto, Double velMax, Double velMin, Boolean ligado) {
        NumeroCarro = numeroCarro;
        Piloto = piloto;
        VelMax = velMax;
        VelMin = velMin;
        Ligado = ligado;
    }

    public int getNumeroCarro() {
        return NumeroCarro;
    }

    public void setNumeroCarro(int numeroCarro) {
        NumeroCarro = numeroCarro;
    }

    public String getPiloto() {
        return Piloto;
    }

    public void setPiloto(String piloto) {
        Piloto = piloto;
    }

    public Double getVelMax() {
        return VelMax;
    }

    public void setVelMax(Double velMax) {
        VelMax = velMax;
    }

    public Double getVelMin() {
        return VelMin;
    }

    public void setVelMin(Double velMin) {
        VelMin = velMin;
    }

    public Boolean getLigado() {
        return Ligado;
    }

    public void setLigado(Boolean ligado) {
        Ligado = ligado;
    }




}
