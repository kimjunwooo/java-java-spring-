public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        float f = 35.6f; 
        // java는 소수 기본형이 double로 인식하기 때문에 f = 35.6이라고 변수 선언을 하면 error가 뜸
        // 따라서 float f = 35.6f; 처럼 뒤에 f를 붙여야 함
        boolean b = false;
        char c = 'A';
        String s = "APPLE"; 
        // String은 UDDT(user define data type)이므로 compiler가 String class를 찾을 수 있도록 사실 java.lang.String이라고 작성해야 한다.
        // 하지만 compiler가 String을 인식하고 있기 때문에 앞부분 생략함
        // Q. 69를 10진수, 2진수, 8진수, 16진수로 출력하시오.
        int decimal = 69;
        System.out.println("decimal = " + decimal);
        int binary = 0b01000101;
        System.out.println("binary = " + binary);
        int octopus = 0105;
        System.out.println("octopus = " + octopus);
        int hexadecimal = 0x45;
        System.out.println("hexadecimal = " + hexadecimal);  // 모두 69로 출력이 된다.
        int dec = 123;
        System.out.println("dec = " + dec);
        int oct = 0173;
        System.out.println("oct = " + oct);
        int hex = 0x78;
        System.out.println("hex = " + hex);
        int bin = 0b01111011;
        System.out.println("bin = " + bin); // 모두 123으로 출력이 된다.
    }
}
