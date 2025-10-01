import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        boolean b = sc.nextBoolean();
        char ch = sc.next().charAt(0);
        String full = sc.nextLine();

        // Switch Case

        int n = 4;

        switch (n) {
            case 100:

                break;

            case 2:
                break;

            case 4:
                System.out.println("This is Case 4");
                break;

            default:
                System.out.println("THis is Default Press the Correct Option");
                break;
        }
    }

}
