import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by mskwon on 2024. 8. 28..
 */
public class Main {
    public static void main(String[] args) {
        String my_string = "Program29b8UYP";
        String overwrite_string = "merS123";
        int s = 7;
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        System.out.println(before + overwrite_string + after);
    }
}