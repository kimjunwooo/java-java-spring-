// Class 단위로 프로그래밍 한다.
public class Operator {
    public static void main(String[] args) {
        // 두 과목의 점수를 이용하여 총점과 평균을 출력하는 JavaSE 프로그램을 만들어보자.
        int kor, eng; // 변수 선언 -> RAM에 기억공간이 만들어진다.
        kor = 77; // kor라는 변수에 77이라는 정수 값을 할당한다.
        eng = 87; // eng라는 변수에 87이라는 정수 값을 할당한다.
        System.out.println("총점:"+(kor+eng)); // 총점:164
        System.out.println("평균:"+((kor+eng)/2)); // 총점:82
    }
}
