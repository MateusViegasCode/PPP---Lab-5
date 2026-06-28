package Exercicio3;

import java.util.ArrayList;
import java.util.List;

class CET implements Subject {
    private List<Observer> observers;
    private double temperatura;
    private double umidade;
    private double vento;

    public CET() {
        this.observers = new ArrayList<>();
    }

    public void setMedicoes(double temperatura, double umidade, double vento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.vento = vento;
        notifyObservers();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperatura, umidade, vento);
        }
    }
}
