import java.io.*;
import java.util.Scanner;

public class A2_start {
    public static void main(String[] args) {
        File file = createFile("src/foo.txt");
        writeToFile(file, true);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeToFile(File file, boolean append) {
        try (FileWriter fileWriter = new FileWriter(file, append);
             PrintWriter writer = new PrintWriter(fileWriter);) {
            writer.println("Bianca");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            FileWriter fileWriter = new FileWriter(file,append);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("Jamila");
            writer.flush();
            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static File createFile(String path){
        try {
            File file = new File(path);
            if (!file.exists()){
                file.createNewFile();
            }
            return file;
        }catch (IOException e){
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
}

