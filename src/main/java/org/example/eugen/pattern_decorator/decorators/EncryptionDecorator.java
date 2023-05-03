package org.example.eugen.pattern_decorator.decorators;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String decode(String readData) {
        byte[] result = Base64.getDecoder().decode(readData);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);    }
}
