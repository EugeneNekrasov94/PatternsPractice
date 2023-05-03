package org.example.eugen.factory_method.factory;

import org.example.eugen.factory_method.buttons.Button;
import org.example.eugen.factory_method.buttons.WindowButton;

public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
