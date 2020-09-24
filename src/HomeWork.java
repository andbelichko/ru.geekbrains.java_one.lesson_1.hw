import javafx.scene.chart.ScatterChart;

import java.io.*;
import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        gluing();

    }

    private static void gluing() {

        try {
            Scanner scanner = new Scanner(new FileInputStream("File2.txt"));
            while (scanner.hasNext()) {
                String text = scanner.next();


                PrintStream ps = new PrintStream(new FileOutputStream("File1.txt", true));
                ps.println(text);

            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}

