package downcase.v2_decorator;

import java.io.*;

public class LowerCaseStream extends FilterInputStream {
    public LowerCaseStream(InputStream in) {
        super(in);
    }

    private byte toLowerCase(byte b) {
        return (byte)Character.toLowerCase((char)b);
    }

    private void makeLowerCase(byte[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = toLowerCase(b[i]);
        }
    }

    @Override
    public int read(byte[] b) throws IOException {
        int result = super.read(b);
        makeLowerCase(b);
        return result;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        makeLowerCase(b);
        return result;
    }
}
