package org.example.eugen.factory_method;

import org.example.eugen.factory_method.buttons.Button;
import org.example.eugen.factory_method.factory.Dialog;
import org.example.eugen.factory_method.factory.HtmlDialog;
import org.example.eugen.factory_method.factory.WindowDialog;

public class Main {
    public static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runLogic() {
        dialog.renderWindow();
    }
}
