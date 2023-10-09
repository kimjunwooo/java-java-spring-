import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// 년도를 입력 받아서 해당 년도가 윤년인지 아닌지를 판단하여 출력하는 코드
        System.out.print("년도를 입력하세요 : ");
        int year = scan.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println("윤년입니다~");
        }else{
            System.out.println("윤년이 아닙니다~");
        }
    }
}
