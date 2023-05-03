package org.example.eugen.abstract_factory.checkboxes;

public class WinCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("This is Win checkbox");
    }
}
