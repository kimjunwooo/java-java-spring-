public class MovieTest {
    public static void main(String[] args) {
        Movie a = new Movie();
        a.title = "아바타";
        a.date = "2022.12.14";
        a.character = "제이크 설리";
        a.genre = "액션";
        a.time = 192;
        a.grade_age = 12;
        System.out.println(a.title +"\t" + a.date + "\t" + a.character +"\t" + a.genre +"\t" + a.time + "\t" + a.grade_age);
    }
}
