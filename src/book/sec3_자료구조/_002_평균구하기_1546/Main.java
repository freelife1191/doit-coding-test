package book.sec3_자료구조._002_평균구하기_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1546
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) max = nums[i];
            sum += nums[i];
        }
        System.out.println(sum*100.0/max/n);
    }
}
/*
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }
    int max = 0;
    int sum = 0;
    for (int i = 0; i < n; i++) {
        if (nums[i] > max) max = nums[i];
        sum += nums[i];
    }
    System.out.println(sum*100.0/max/n);
}
*/