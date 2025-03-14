package level0;

/**
 * Created by mskwon on 2025. 3. 13..
 */
public class 양꼬치_120830 {
    public static void main(String[] args) {
        int price = 12000;
        int drink = 2000;
        int n = 10;
        int k = 3;
        int answer = (price * n) + (drink * k - (drink * (n / 10)));
        System.out.println(answer);
    }
}
