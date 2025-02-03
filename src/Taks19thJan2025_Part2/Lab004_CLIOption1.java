package Taks19thJan2025_Part2;

public class Lab004_CLIOption1 {
    public static void main(String[] args) {

        String name_string = args[0];
        String age_string = args[1];
        String salary_string = args[2];

      //  int name = Integer.parseInt(name_string);
        int age = Integer.parseInt(age_string);
        int salary = Integer.parseInt(salary_string);

        System.out.println("My name is " + name_string);
        System.out.println("My age is " + age);
        System.out.println("My salary is " + salary);

    }
}
