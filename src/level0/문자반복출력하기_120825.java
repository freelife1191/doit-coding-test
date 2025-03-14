package level0;

/**
 * Created by mskwon on 2025. 3. 13..
 */
public class 문자반복출력하기_120825 {

    public static void main(String[] args) {
        String str = "hello";
        StringBuilder answer = new StringBuilder();
        for (char c : str.toCharArray()) {
            answer.append(Character.toString(c).repeat(3));
        }
        System.out.println(answer);
    }
}
