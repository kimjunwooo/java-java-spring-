import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성적을 입력하세요 : ");
        int score = scan.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("범위를 벗어났습니다. 다시 입력 하세요 ^^");
        } else if (score >= 90) {
            System.out.println("A반입니다~");
        } else if (score >= 85) {
            System.out.println("B반입니다~");
        } else if (score >= 80) {
            System.out.println("C반입니다~");
        } else {
            System.out.println("공부 좀 하세요. 불합격입니다.");
        }
    }
}