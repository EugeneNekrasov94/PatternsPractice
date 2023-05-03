package org.example.eugen.abstract_factory.factories;

import org.example.eugen.abstract_factory.buttons.Button;
import org.example.eugen.abstract_factory.buttons.MacButton;
import org.example.eugen.abstract_factory.checkboxes.Checkbox;
import org.example.eugen.abstract_factory.checkboxes.MacOSCheckbox;

public class MacGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
