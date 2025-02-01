import java.util.Scanner;

public class Lab003_LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        System.out.println("Enter value of c");
        int c = sc.nextInt();

        String result = a >b ? "a is greater" : (b>c ? "b is greater" : "c is greater");

        System.out.println(result);
    }
}
