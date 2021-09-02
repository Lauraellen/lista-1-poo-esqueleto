package br.inatel.cdg.algebra.reta;

import com.sun.javafx.tk.Toolkit;

public class Reta {
    public Ponto p1;
    public Ponto p2;

    public Reta() {

    }

    // c. angular
    public double angular (Ponto p1, Ponto p2, double result) {
        result = (p2.y - p1.y) / (p2.x - p1.x);
        return result;
    }

    // c. linear
    void linear(double result, Ponto p1, double linear) {
        linear = p1.y - (result * p1.x);
    }






}
