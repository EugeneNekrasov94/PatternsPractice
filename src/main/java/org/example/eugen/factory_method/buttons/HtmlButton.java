package org.example.eugen.factory_method.buttons;

public class HtmlButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Click! This is html button!");
    }

    @Override
    public void render() {
        System.out.println("<button>Test button</button>");
        onClick();
    }
}
