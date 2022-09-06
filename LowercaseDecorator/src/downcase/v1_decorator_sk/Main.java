package downcase.v1_decorator_sk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@SuppressWarnings("DuplicatedCode")
public class Main {
    @SuppressWarnings("UnnecessaryLocalVariable")
    public static void main(String[] args) {
        String text = "This is a BIG undertaking!!!";
        InputStream textStream = new ByteArrayInputStream(text.getBytes());
        // Use LowerCaseStream decorator here!
        InputStream lowerCaseStream = textStream;
        try {
            System.out.println(new String(lowerCaseStream.readAllBytes(), StandardCharsets.UTF_8));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
