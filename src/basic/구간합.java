package basic;

import java.util.Arrays;

/**
 * A 배열이 있을때
 * 합배열 S배열을 만드는 방법
 * S[i] = S[i-1] + A[i]
 *
 * 구간 합을 구하는 공식
 * S[j] - S[i-1]
 * Created by mskwon on 2025. 3. 13..
 */
public class 구간합 {
    public static void main(String[] args) {
        int A[] = new int[]{15, 13, 10, 7, 3, 12};
        int S[] = new int[A.length];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            S[i] = sum;
        }
        System.out.println(Arrays.toString(S));
    }
}
