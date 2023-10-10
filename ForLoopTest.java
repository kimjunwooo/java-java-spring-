public class ForLoopTest {
    public static void main(String[] args) {
        for (char c = 'A';c<='Z';c++){
            System.out.println(c+"\t"+(int)c); // 영어 대문자 character와 그에 해당하는 아스키 코드값
        }

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i] + "\t");
        }
        System.out.println();
        for(int su : numbers){
            System.out.print(su + "\t"); // foreach문(향상된 for문)
        }
    }
}
