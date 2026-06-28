package Exercicio3;

class AeroportoUberlandia implements Observer {
    public void update(double temperatura, double umidade, double vento) {
        if (vento > 50.0) {
            System.out.println("Rajadas de vento " + vento + " km/h)");
        }
    }
}
