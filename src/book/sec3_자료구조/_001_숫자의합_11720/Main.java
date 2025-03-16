package book.sec3_자료구조._001_숫자의합_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11720
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String strNums = st.nextToken();
        char[] arr = strNums.toCharArray();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i] - '0';
        }
        System.out.println(sum);
    }
}
/*
public static void main(String[] args) {
    // int size = 5;
    // String n = "54321";
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String n = sc.next();
    // char[] chars = n.toCharArray();
    int sum = 0;
    for (int i = 0; i < size; i++) {
        // sum += chars[i] - '0';
        sum += Integer.parseInt(n.charAt(i) + "");
    }
    System.out.println(sum);
}
*/
