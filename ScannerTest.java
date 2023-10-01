import java.util.Scanner; // Scanner의 위치

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner의 위치를 컴파일러에게 알려줘야 함.
        System.out.println("정수를 입력세요:");
        int num = scan.nextInt(); // 키보드에 값을 입력해야 num에 할당이 된다.
        System.out.println("num = " + num);

        System.out.println("실수를 입력하세요 : ");
        float f = scan.nextFloat();
        System.out.println("f = " + f);

        System.out.println("문자열을 입력하세요 : ");
        String str = scan.next();
        System.out.println("str = " + str);;

        scan.nextLine(); // 버퍼 비우기(스트림 비우기)
        /* scan.next()에서 키보드로 띄어쓰기를 포항하여 문자열을 입력하면 뒤에 문자열이 스트림에 남아서
        다음 출력에 나오는 경우가 있음으로 스트림 비우기 코드를 작성하여 스트림을 비우고 다음 출력을 진행해야 한다.
         */

        System.out.println("문자열을 입력하세요 : ");
        String str1 = scan.nextLine();
        System.out.println("str1 = " + str1);;
    }
}
