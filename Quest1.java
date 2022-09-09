package PacoteAtt2;

public class Quest1 {
    public static void main(String[] args){
        double soma = 0;

        for(int i=0; i <= 500; i++){
            if(i % 3 == 0 && i % 2 != 0 ){
                soma = soma+i;
            }

        }
        System.out.println("a soma de todos os números ímpares que são múltiplos de\n" +
                "três e que se encontram no conjunto dos números de 1 até 500 é : " + soma);


    }
}
