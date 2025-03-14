package level0;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by mskwon on 2025. 3. 13..
 */
public class 세균증식_120910 {
    public static void main(String[] args) {
        // int reduce = IntStream.range(0, 10).reduce(2, (total, n) -> total * 2);
        // System.out.println(reduce);
        int n = 7;
        int t = 15;
        // int sum = n;
        // for (int i = 0; i < t; i++) {
        //     sum *= 2;
        // }
        // System.out.println(sum);
        // System.out.println(n << t);
        System.out.println(n * (int)Math.pow(2, t)); // 지수 증가 패턴
    }
}
