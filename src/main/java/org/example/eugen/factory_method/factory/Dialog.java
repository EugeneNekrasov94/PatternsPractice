package org.example.eugen.factory_method.factory;

import org.example.eugen.factory_method.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
