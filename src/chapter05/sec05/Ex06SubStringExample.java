package chapter05.sec05;

public class Ex06SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstName = ssn.substring(0, 6);
        System.out.println(firstName);

        String secondName = ssn.substring(7);
        System.out.println(secondName);
    }
}
