public class VDATest {
    public static void main(String[] args) {
        int a = 10; // 변수 선언과 할당
        System.out.println("a = " + a);
        int b = a;
        System.out.println("b = " + b);
        int c = b * 10;
        System.out.println("c = " + c);
        int sum = 0; // 초기화
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        System.out.println("sum = " + sum);
        int x = 10;
        int y = 20;
        System.out.println("x = " + x + " : " + "y = " + y);
        int z = x;  // swap을 위해 변수 하나 더 선언
        x = y;
        y = z;
        System.out.println("x = " +x + " : " + "y = " + y);
    }
}
