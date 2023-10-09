import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();
        if (num%7==0){
            System.out.println("7의 배수입니다~");
        }else
            System.out.println("7의 배수가 아닙니다^^");
    }
}
