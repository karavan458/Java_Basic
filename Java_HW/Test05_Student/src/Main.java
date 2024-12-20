import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] student = new Student[3];

        System.out.println("Enter the name of students: ");
        for(int i = 0; i < 3; i++) {
            student[i].name = sc.nextLine();


        }


    }
}
