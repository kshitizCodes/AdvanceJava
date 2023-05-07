package Lab2.QN4;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src/Lab2/QN4/file")) {
            writer.write("Advance Java\nLab2\nQN4");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
