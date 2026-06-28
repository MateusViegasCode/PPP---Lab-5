package Exercicio3;

class PrefeituraUberlandia implements Observer {
    public void update(double temperatura, double umidade, double vento) {
        if (umidade < 30.0) {
            System.out.println("Umidade do ar: (" + umidade + "%)");
        }
    }
}
