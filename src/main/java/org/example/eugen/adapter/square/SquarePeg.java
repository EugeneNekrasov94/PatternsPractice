package org.example.eugen.adapter.square;

public class SquarePeg {
    private double x;

    public SquarePeg(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getSquare() {
        return Math.pow(getX(),2);
    }
}
