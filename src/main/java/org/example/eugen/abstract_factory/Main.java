package org.example.eugen.abstract_factory;

import org.example.eugen.abstract_factory.app.Application;
import org.example.eugen.abstract_factory.factories.GUIFactory;
import org.example.eugen.abstract_factory.factories.MacGUIFactory;
import org.example.eugen.abstract_factory.factories.WinGUIFactory;

public class Main {
    private static Application configure(){
        GUIFactory factory;
        String configName = System.getProperty("os.name");

        if (configName.equals("win")) {
            factory = new WinGUIFactory();
        } else {
            factory = new MacGUIFactory();
        }
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application application = configure();
        application.paint();
    }
}
