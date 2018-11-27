import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RetriveFile {
    public static void main(String[] args) {
        retriveFile("src/shapes/kc.txt");
    }
    public static void retriveFile(String fileLocation) {
        Path filePath = Paths.get(fileLocation);
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line : lines){
            System.out.println(line);
        }
    }
}
