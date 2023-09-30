public class TwoDimArrayInit {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t"); // 각 row별 column 값을 출력함.
            }
            System.out.println(); // 한 칸 띄어서 2번째 row 출력.
        }
        int[][] b = new int[5][];
        b[0] = new int[1];
        b[1] = new int[2];
        b[2] = new int[3];
        b[3] = new int[4];
        b[4] = new int[5];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = '*';
                System.out.print((char)b[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
