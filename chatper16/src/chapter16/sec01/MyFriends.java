package chapter16.sec01;

class UnivFriend {
    private String name;
    private String major;
    private String phone;

    public UnivFriend(String na, String ma, String ph) {
        name = na;
        major = ma;
        phone = ph;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("Phone: " + phone);
    }
}

class CompFriend {
    private String name;
    private String department;
    private String phone;

    public CompFriend(String na, String de, String ph) {
        name = na;
        department = de;
        phone = ph;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Phone: " + phone);
    }
}

public class MyFriends {
    public static void main(String[] args) {
        //대학동창의 관리를 위한 배열과 변수
        UnivFriend[] ufrns = new UnivFriend[5];
        int ucnt = 0;

        //직장 동료의 관리를 위한 배열과 변수
        CompFriend[] cfns = new CompFriend[5];
        int ccnt = 0;

        //대학 동창의 정보 저장
        ufrns[ucnt++] = new UnivFriend("LEE", "computer", "010-1111-1111");
        ufrns[ucnt++] = new UnivFriend("Kim", "electronics", "010-2222-2222");

        //직장 동료의 정보 저장
        cfns[ccnt++] = new CompFriend("Park", "R&D1", "010-5555-5555");
        cfns[ccnt++] = new CompFriend("Jung", "MD", "010-6666-6666");

        //모든 동창및 동료의 정보 전체 출력
        for(int i = 0; i < ucnt; i++) {
            ufrns[i].showInfo();
            System.out.println();
        }

        for(int i = 0; i < ccnt; i++) {
            cfns[i].showInfo();
            System.out.println();
        }
    }
}
