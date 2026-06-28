package Exercicio3;

public class Main {
    public static void main(String[] args) {

        CET cet = new CET();

        PrefeituraUberlandia prefeitura = new PrefeituraUberlandia();
        AeroportoUberlandia aeroporto = new AeroportoUberlandia();

        cet.addObserver(prefeitura);
        cet.addObserver(aeroporto);

        cet.setMedicoes(25.0, 50.0, 20.0);

        cet.setMedicoes(32.0, 25.0, 15.0);

        cet.setMedicoes(22.0, 60.0, 60.0);
    }
}