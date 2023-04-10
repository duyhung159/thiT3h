package Bai3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bai3 {
    public static void main(String[] args) {
        String fileName = "E:\\JAVA_T3H\\thiT3h.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Noi dung file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Da xay ra loi khi doc file: " + e.getMessage());
        }
    }
}
