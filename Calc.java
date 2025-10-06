import java.util.Scanner;

public class Calc {
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;

    }

    static int mul(int a, int b) {
        return a * b;

    }

    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        System.out.println("Enter the Operator");
        char choice = sc.next().charAt(0);

        switch (choice) {
            case '+': {
                int result = add(a, b);
                System.out.println("The Result is " + result);
                break;
            }
            case '-': {
                int result = sub(a, b);
                System.out.println("The Result is " + result);
                break;
            }
            case '*': {
                int result = mul(a, b);
                System.out.println("The Result is " + result);
                break;
            }
            case '/': {
                int result = div(a, b);
                System.out.println("The Result is " + result);
                break;
            }

            default:
                System.out.println("Enter the Correct Option ");
                break;
        }
    }
}
