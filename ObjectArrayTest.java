public class ObjectArrayTest {
    public static void main(String[] args) {
        // 실수 3개를 저장 할 배열을 생성하고 값을 저장하시오.
        float[] f = {24.5f, 50.2f, 34.8f};
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);
        //영화 3 편을 저장 할 배열을 생성하고 영화 3편의 데이터를 저장하고 출력하세요.
        Movie[] m = new Movie[2];
        m[0] = new Movie();
        m[0].title = "아바타";
        m[0].time = 3;
        m[0].grade_age = 12;
        m[0].date = "2014-2-28";
        m[0].genre = "fantasy";
        m[0].character = "존";

        m[1] = new Movie();
        m[1].title = "스파이더맨";
        m[1].time = 2;
        m[1].grade_age = 15;
        m[1].date = "2022-3-31";
        m[1].genre = "HERO";
        m[1].character = "톰 홀랜드";

        for(int i=0;i< m.length;i++){
            System.out.println(m[i].title + "\t" + m[i].time +"\t" + m[i].character + "\t" + m[i].date + "\t" + m[i].genre + "\t" + m[i].grade_age);
        }
    }
}
