import java.io.*;

public class A4_DataCSVRead {
    public static void main(String[] args) {
        try {
            // provided the file path
            String filePath = "src/data.csv";

            // Create BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Read the file line by line and stored in a StringBuilder
            StringBuilder fileContens = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                fileContens.append(line).append("\n");
            }

            // Close reader
            reader.close();

            // Display the contents of the file
            System.out.println("Contents of the file 'data.cvs: '");
            System.out.println(fileContens.toString());
        } catch (IOException e) {
            System.out.println("An error occurred while reading file: " + e.getMessage());
        }
    }
}
