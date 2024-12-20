import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] str = new String[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < str.length; i++) {
            System.out.print("Enter String " + i + ": ");
            str[i] = sc.nextLine();
        }

        for(int i = 0 ; i < str.length; i++) {
            Random r = new Random();
            String temp = "";
            temp = str[i];
            str[i] = str[r.nextInt(9)];
            str[r.nextInt(str.length)] = temp;
        }


        for(int i = 0; i < str.length; i++) {
            System.out.printf("str[%d] : %s\n" , i, str[i]);
        }
    }
}