package org.example.eugen.abstract_factory.factories;

import org.example.eugen.abstract_factory.buttons.Button;
import org.example.eugen.abstract_factory.checkboxes.Checkbox;

//АБСТРАКТНАЯ ФАБРИКА, предоcтавляющая обьекты на основе интерфейса(абстракции),а не реализации
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
