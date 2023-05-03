package org.example.eugen.abstract_factory.buttons;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("This is Windows Button");
    }
}
