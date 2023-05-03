package org.example.eugen.adapter;

import org.example.eugen.adapter.round.RoundPeg;
import org.example.eugen.adapter.square.SquarePeg;

import java.io.InputStream;
import java.io.InputStreamReader;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;
    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow(squarePeg.getX() / 2,2)*2);
    }
}
