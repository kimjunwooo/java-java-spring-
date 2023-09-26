public class MenmberTest {
    public static void main(String[] args) {
        Member a = new Member(); // 객체 변수 a에 인스턴스 주소 할당 -> a는 인스턴스 변수가 됨.
        a.name = "홍길동";
        a.age = 30;
        a.tel = "010-1111-1111";
        a.email = "fc@naver.com";
        a.addr = "서울";
        a.weight = 57.6f; // 소수 기본형은 double임을 인지하고 항상 float 자료형 사용시 소수 뒤 f 붙이는 것 잊지 말자
        System.out.println(a.name + "\t" + a.age + "\t" + a.tel + "\t" + a.email + "\t" + a.addr + "\t" + a.weight + "\t");
    }
}
