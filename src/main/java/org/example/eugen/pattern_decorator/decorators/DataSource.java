package org.example.eugen.pattern_decorator.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
