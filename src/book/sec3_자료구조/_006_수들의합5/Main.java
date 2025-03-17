package book.sec3_자료구조._006_수들의합5;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2018
 *
 * N 변수 저장
 * 사용자 변수 초기화(count = 1, start_index = 1, end_index = 1, sum = 1)
 * while(end_index != N) {
 *     if(sum == N) count 증가, end_index 증가, sum값 변경
 *     else if(sum > N) sum값 변경, start_index 증가
 *     else if(sum < N) end_index 증가, sum값 변경
 * }
 * count 출력하기
 *
 * 투 포인터 이동 원칙
 * N은 입력받은 합 - 합의 값을 이룰 수 있는 경우의 수를 모두 찾아야 함
 * sum > N: sum = sum - start_index; start_index++; -> sum이 N보다 크면 start_index 값을 이동시켜서 빼주어야 함
 * sum < N: end_index++; sum = sum + end_index; -> sum이 N보다 작으면 end_index 값을 이동시켜서 더해줘야 함
 * sum == N: end_index++; sum = sum + end_index; count++; 합의 값이 나오면 count 증가
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while (end_index!=n) {
            if(sum==n) { // 합의 값이 나왔으므로 증가하고 end_index 를 증가시키고 sum 값에 더해줌
                count++; end_index++; sum = sum + end_index;
            } else if(sum>n) { // sum이 n보다 크면 start_index 을 이동시키고 sum 값에서 이동된 start_index 값을 빼줘야 한다
                sum = sum - start_index;
                start_index++;
            } else { // sum이 n보다 작으면 end_index 를 이동시키고 sum 값에 end_index 값을 더한다
                end_index++; sum = sum + end_index;
            }
        }
        System.out.println(count);
    }
}