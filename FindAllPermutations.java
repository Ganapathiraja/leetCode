import java.util.*;

public class FindAllPermutations {
    public static void main(String[] args) {
        // basically finds all the permutation of the string
        String input = "abc";
        solution(input, "");

    }

    private static void solution(String input, String answer) {

        if (input.length() == 0) {
            System.out.print(answer + "  ");
            return;
        } else {

            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);
                String left_substr = input.substring(0, j);
                String right_substr = input.substring(j + 1);
                String rest = left_substr + right_substr;
                String total = answer + ch;
                solution(rest, total);
            }
        }
    }
}
