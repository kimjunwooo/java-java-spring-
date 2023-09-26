public class BookExam {
    public static void main(String[] args) {
        // 한 권의 책 데이터를 저장하기 위해서 객체를 생성하시오.(인스턴스를 만드시오)
        Book b; // 이때 b는 객체 변수이고 아래 b는 인스턴스 변수이다.
        b = new Book(); // 객체를 생성해서 번지(address)를 b에 저장
        b.title = "홀로 서기 심리학"; // 도트(Dot)연산자 = 참조 연산자
        b.price = 15000;
        b.company = "메이븐";
        b.author = "라라";
        b.page = 267;
        b.isbn = "979-11-90538-20-6";
        System.out.println(b.title+ "\t" + b.price + "원" + "\t" + b.company + "\t" + b.author + "\t" + b.page+ "페이지" + "\t" + b.isbn);
    }
}
