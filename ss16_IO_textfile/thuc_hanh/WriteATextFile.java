package ss16_IO_textfile.thuc_hanh;

import java.io.FileWriter;
import java.io.IOException;

public class WriteATextFile {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter writer = new FileWriter("Hello.txt");
            writer.write("Hello World");
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
