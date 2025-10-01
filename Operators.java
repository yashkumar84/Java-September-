public class Operators {
    public static void main(String[] args) {
        System.out.println(10 / 20);
        // 1. Arithmetic Operators
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);
        System.out.println(b % a);
        System.out.println(++a);
        System.out.println(a++); // 11
        System.out.println(a); // 12
        System.out.println(--a); // 11
        System.out.println(a--); // 11
        System.out.println(a); // 10

        // 2. Relational Operators
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        // 3. Logical Operators
        System.out.println((a == b) && (a < b));
        System.out.println((a == b) || (a < b));
        System.out.println(!(a == b));

        // 4. Bitwise Operators
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << 2);

        System.out.println(a >> 2);
        System.out.println(a >>> 2);
    }
}

//0000000000000000000000101

//1111111111111111111111010 
//0000000000000000000000101
//+1

//0000000000000000000000110

