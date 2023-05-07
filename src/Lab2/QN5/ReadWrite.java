package Lab2.QN5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src/Lab2/QN4/file");
             FileWriter writer = new FileWriter("src/Lab2/QN5/file")) {
            int i;
            while ((i = reader.read()) != -1) {
                writer.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
