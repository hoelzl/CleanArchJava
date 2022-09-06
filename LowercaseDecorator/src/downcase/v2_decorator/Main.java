package downcase.v2_decorator;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String text = "This is a BIG undertaking!!!";
        InputStream textStream = new ByteArrayInputStream(text.getBytes());
        InputStream lowerCaseStream = new LowerCaseStream(textStream);
        try {
            System.out.println(new String(lowerCaseStream.readAllBytes(), StandardCharsets.UTF_8));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
