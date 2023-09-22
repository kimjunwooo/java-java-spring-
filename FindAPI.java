public class FindAPI {
    public static void main(String[] args) {
        int a; // variable declaration (primitive data type)
        // AAA b;  cannot resolve symbol
        a = 10;
        System.out.println("a = " + a);
        java.lang.String s; // lang package 내에 있는 class 들은 자주 쓰기에 생략 가능
        s = "APPLE";
        System.out.println("s = " + s);
        System.out.println(s.length()); // String class 내의 method
        System.out.println(s.toLowerCase()); // 대문자를 소문자로 변환
    }
}
