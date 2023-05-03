package org.example.eugen.adapter;

import org.example.eugen.adapter.round.RoundHole;
import org.example.eugen.adapter.round.RoundPeg;
import org.example.eugen.adapter.square.SquarePeg;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (roundHole.fits(roundPeg))
            System.out.println("Match!");

        SquarePeg squareSmall = new SquarePeg(2);
        SquarePeg squareLarge = new SquarePeg(8);

        //roundHole.fits(squareSmall);


        SquarePegAdapter smallSqAdapter = new SquarePegAdapter(squareSmall);
        SquarePegAdapter largeSqAdapter = new SquarePegAdapter(squareLarge);

        if (roundHole.fits(smallSqAdapter)) {
            System.out.println("Small match!");
        }
        if (roundHole.fits(largeSqAdapter))
            System.out.println("Large sq match!!");
    }
}
