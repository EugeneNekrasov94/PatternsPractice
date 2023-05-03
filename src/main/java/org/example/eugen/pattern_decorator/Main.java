package org.example.eugen.pattern_decorator;

import org.example.eugen.pattern_decorator.decorators.*;

public class Main {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator dataSourceDecorator = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("C:\\Users\\enekr\\IdeaProjects\\PatternsPractice\\src\\main\\java\\org\\example\\eugen\\pattern_decorator\\out\\Demo.txt")),3);
        dataSourceDecorator.writeData(salaryRecords);

        DataSource plain = new FileDataSource("C:\\Users\\enekr\\IdeaProjects\\PatternsPractice\\src\\main\\java\\org\\example\\eugen\\pattern_decorator\\out\\Demo.txt");

        System.out.println("Input________");
        System.out.println(salaryRecords);
        System.out.println("Encoded_________");
        System.out.println(plain.readData());
        System.out.println("Decoded________");
        System.out.println(dataSourceDecorator.readData());
    }
}
