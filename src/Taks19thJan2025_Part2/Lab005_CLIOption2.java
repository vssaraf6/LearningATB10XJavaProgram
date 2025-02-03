package Taks19thJan2025_Part2;

public class Lab005_CLIOption2 {
    public static void main(String[] args) {

        String num1_string = args[0];
        String num2_string = args[1];

        int num1 = Integer.parseInt(num1_string);
        int num2 = Integer.parseInt(num2_string);

        String result = num1>num2? "num1 is greater":"num2 is greater";
        System.out.println(result);
    }
}
