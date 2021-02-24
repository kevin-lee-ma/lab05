package sol;
import java.io.*;
import java.util.LinkedList;

public class Courses {
    public static void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            while (line != null) {
                String toPrint = findCourseCodes(line);
                System.out.println(toPrint);
            }
        }
        catch (IOException e) {
            System.out.println("Encountered an error: " + e.getMessage());
        }
    }
    public static String findCourseCodes(String input) {
        return RegexMatcher.regexifier(input, "[A-Z]{3,4}[0-9]{4}[A-Z]{0,1}");
    }

    public static void main(String[] args) {
        run();
    }
}
