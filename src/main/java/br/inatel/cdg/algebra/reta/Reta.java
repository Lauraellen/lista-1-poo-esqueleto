package br.inatel.cdg.algebra.reta;

import com.sun.javafx.tk.Toolkit;

public class Reta {

    //coordenadas A(x,Y) e B(x,y);
    private Ponto A;
    private Ponto B;

    public Reta(Ponto A, Ponto B) {
        this.A = A;
        this.B = B;
    }


    // c. angular
    public double angular () {
        double resultAngular = 0;

        resultAngular = (B.getY() - A.getY()) / (B.getX() - A.getX());
        return resultAngular;
    }

    // c. linear
    public double linear() {
        double resultLinear = 0;

        resultLinear = A.getY() - (angular() * A.getX());

        return resultLinear;
    }






}
