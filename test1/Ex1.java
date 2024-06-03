import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong() + 1;
        System.out.println(solution(String.valueOf(num)));
    }

    private static String solution(String num) {
        return num.replaceAll("0","1");
    }
}
