import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A6_DataCSVPrintInfo {
    public static void main(String[] args) {
        try {
            // Provide file Path
            String filePath = "src/data.cvs";
            // create a new BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            // Extract the header from content
            String header = reader.readLine();
            // Read and print each line after the header
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
