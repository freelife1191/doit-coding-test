import java.util.stream.IntStream;

/**
 * Created by mskwon on 2024. 8. 28..
 */
public class IntTest {
    public static void main(String[] args) {
        int n = 3;
        int[] num_list = {5, 2, 1, 7, 5};

        IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).forEach(System.out::println);
    }
}
