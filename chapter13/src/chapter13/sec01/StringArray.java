package chapter13.sec01;

public class StringArray {
    public static void main(String [] args) {
        String[] ar = new String[7];
        ar[0] = new String("Java");
        ar[1] = new String("System");
        ar[2] = new String("Complier");
        ar[3] = new String("Park");
        ar[4] = new String("Tree");
        ar[5] = new String("Dinner");
        ar[6] = new String("Brunch Cafe");

        int cnum = 0;

        for(int i = 0; i < ar.length; i++) cnum += ar[i].length();

        System.out.println("총 문자의 수: " + cnum);

     }
}
