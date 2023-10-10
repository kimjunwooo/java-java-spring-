import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("요일을 입력하세요 : ");
        String weekend = scan.nextLine();
        switch (weekend){
            case "Sunday":
                System.out.println("야구하기");break;
            case "Monday":
                System.out.println("농구하기");break;
            case "Tuesday":
            case "Wednesday":
                System.out.println("수영하기");break;
            case "Friday":
            case "Saturday":
                System.out.println("휴식");break;
            default:
                System.out.println("잘못 입력하였습니다.");
        }
    }
}
