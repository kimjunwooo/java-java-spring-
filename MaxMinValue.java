public class MaxMinValue {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int min=(a<b) ? a : b;
        System.out.println(min);

        int max = (a<b) ? b : a;
        System.out.println(max); // 삼항 연상자..
    }
}
