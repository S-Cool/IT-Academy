import java.io.*;

public class CopyData {
    public static void main(String[] args) throws IOException {
        byte[] data = {'H', 'e', 'l', 'l', 'o'};
        InputStream in = new ByteArrayInputStream(data);
        OutputStream out = new FileOutputStream("E:/tmp/ttt.txt");
        copy(in, out);
    }

    private static void copy(InputStream in, OutputStream out) throws IOException {
        try (InputStream in0 = in; OutputStream out0 = new OSAutoAutoCloseable(out)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }
}

class OSAutoAutoCloseable extends OutputStream {

    private final OutputStream out;

    public OSAutoAutoCloseable(OutputStream out) {
        this.out = out;
    }

    @Override
    public void write(int b) throws IOException {
        out.write(b);
    }

    @Override
    public void close() throws IOException {
        try (OSAutoCloseable tmp = new OSAutoCloseable(out)) {
            out.flush();
        }
    }

}

class OSAutoCloseable implements AutoCloseable {

    OutputStream out;

    public OSAutoCloseable(OutputStream out) {
        this.out = out;
    }


    @Override
    public void close() throws IOException {
        out.close();
    }
}