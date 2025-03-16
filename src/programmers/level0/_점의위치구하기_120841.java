package programmers.level0;

/**
 * x, y = 1
 * -x, y = 2
 * -x, -y= 3
 * x, -y = 4
 */
public class _점의위치구하기_120841 {
    public static void main(String[] args) {
        int[] dot = new int[]{2, 4};
        int answer = 1;
        if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        }
        else if ((dot[0] * dot[1]) < 0) {
            if (dot[0] < 0) answer = 2;
            else answer = 4;
        }
        System.out.println(answer);
    }
}
