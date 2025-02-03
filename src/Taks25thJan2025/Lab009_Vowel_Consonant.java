package Taks25thJan2025;

public class Lab009_Vowel_Consonant {
    public static void main(String[] args) {

        String name = "pramod";
        int vcount = 0;
        int ccount = 0;

        //System.out.println(name.length());

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vcount++;
            }
            else {
                ccount++;
            }
        }
        System.out.println("Vowel = "+vcount);
        System.out.println("Consonant = "+ccount);

    }
}
