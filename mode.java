import java.io.DataOutputStream;
import java.io.IOException;

public class mode {

    public static void write(DataOutputStream out) throws IOException {
        out.writeUTF("write");
    }

    public static void stop(DataOutputStream out) throws IOException {
        out.writeUTF("break");
    }
    public static void read(DataOutputStream out) throws IOException {
        out.writeUTF("read");
    }
    
}
