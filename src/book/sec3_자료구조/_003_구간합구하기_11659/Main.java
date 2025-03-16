package book.sec3_자료구조._003_구간합구하기_11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11659
 *
 * 합 배열 공식
 * S[i] = S[i-1] + A[i]
 * 구간 합 공식
 * S[j] - S[i-1]
 *
 * 슈도코드
 * suNo(숫자 개수), quizNo(질의 개수) 저장하기
 * for(숫자 개수만큼 반복하기) {
 *     합 배열 생성하기(S[i] = S[i - 1] + A[i]
 * }
 * for(질의 개수만큼 반복하기) {
 *     질의 범위 받기(i ~ j)
 *     구간 합 출력하기(S[j] - S[i - 1]
 * }
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] S = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }
        for (int q = 0; q < m; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
    }
}
/*
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); // StringTokenizer 로 입력받음
    int suNo = Integer.parseInt(st.nextToken()); // 숫자 개수
    int quizNo = Integer.parseInt(st.nextToken()); // 질의 개수
    // 합 배열 생성
    long[] S = new long[suNo + 1]; // 0은 빼기 위해 + 1
    st = new StringTokenizer(br.readLine()); // 라인마다 새롭게 초기화
    for (int i = 1; i <= suNo; i++) {
        // 이렇게 하면 S[1] 부터 채우기 시작함 배열생성시 바로 합 배열을 생성해버림
        S[i] = S[i-1] + Integer.parseInt(st.nextToken());
    }
    for (int q = 0; q < quizNo; q++) {
        // 구간합 값을 입력 받음
        st = new StringTokenizer(br.readLine());
        // 구간합 시작 배열 값
        int i = Integer.parseInt(st.nextToken());
        // 구간합 종료 배열 값
        int j = Integer.parseInt(st.nextToken());
        // 시작 배열의 -1 에서 부터 시작해야 시작 배열까지 포함하므로 -1을 빼줌
        // 예 1 ~ 3 구간합을 구하려면 0부터 시작해야 1 ~ 3 구간합을 구할 수 있으므로 i-1 임
        System.out.println(S[j] - S[i-1]); // 합 배열 공식 S[j] - S[i-1] 을 하면 구간합을 구할 수 있음
    }
}
*/
