import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A1_start {
    public static void main(String[] args) throws IOException {
        // create file
        File file = new File("src/hello.txt");
        if (!file.exists()){
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("hello");
        printWriter.println("world");

        printWriter.flush();
        printWriter.close();

        // read example
        Scanner sc = new Scanner(file);
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
