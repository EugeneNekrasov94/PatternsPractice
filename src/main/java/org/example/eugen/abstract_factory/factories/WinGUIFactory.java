package org.example.eugen.abstract_factory.factories;

import org.example.eugen.abstract_factory.buttons.Button;
import org.example.eugen.abstract_factory.buttons.WinButton;
import org.example.eugen.abstract_factory.checkboxes.Checkbox;
import org.example.eugen.abstract_factory.checkboxes.WinCheckbox;

public class WinGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
