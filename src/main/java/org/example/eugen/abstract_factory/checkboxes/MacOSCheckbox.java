package org.example.eugen.abstract_factory.checkboxes;

public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("This is MacOS checkbox");
    }
}
