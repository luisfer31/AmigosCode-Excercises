import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A5_DataCSVPrint {
    public static void main(String[] args) {
        try {
            // Provide path
            String filePath = "src/data.csv";
            // BufferedReader to read file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading a file: " + e.getMessage());
        }
    }
}
