import org.junit.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        try {
            Scanner scan=new Scanner(new FileInputStream("src/main/java/Test.txt"));
            while (scan.hasNextLine()) {
                String s=scan.nextLine();
                System.out.println(s);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}