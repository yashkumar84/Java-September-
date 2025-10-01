public class PrintDigit {
    public static void main(String[] args) {
        int n = 89765;
        int sum = 0;
        System.out.println(n % 10);
        System.out.println(n / 10);
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println(sum);
    }

}
