
public class Main {

    public static void main(String[] args) {
        final int a = 123;
        final int b = 10;

        final int c = addTwoNumber(a, b);

        System.out.println("ans:");
        System.out.println(c);

    }

    public static int addTwoNumber(int a, int b) {
        while (b != 0) {
            // carry now contains common set bits of x and y
            final int carry = a & b;
            System.out.println(carry);
            // Sum of bits of x and y where at least one of the bits is not set
            System.out.println(a);
            a = a ^ b;
            System.out.println(a);
            // Carry is shifted by one so that adding it to x gives the required sum
            System.out.println(b);
            b = carry << 1;
            System.out.println(b);
            System.out.println("------");
        }
        return a;
    }

}
