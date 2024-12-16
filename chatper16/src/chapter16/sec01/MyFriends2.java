package chapter16.sec01;

class Friend {
    protected String name;
    protected String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phone);
    }
}

class UnivFriend2 extends Friend {
    private String major;

    public UnivFriend2(String name, String major, String phone) {
        super(name, phone);
        this.major = major;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("전공 : " + major);
    }
}

class CompFriend2 extends Friend {
    private String department;

    public CompFriend2(String name, String department, String phone) {
        super(name, phone);
        this.department = department;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("부서 : " + department);
    }
}

public class MyFriends2 {
    public static void main(String[] args) {
        Friend[] frns = new Friend[5];
        int cnt = 0;

        frns[cnt++] = new UnivFriend2("LEE", "Computer", "010-1111-1111");
        frns[cnt++] = new UnivFriend2("KIM", "Electronic", "010-1111-1111");
        frns[cnt++] = new CompFriend2("PARK", "R&D", "010-5555-5555");
        frns[cnt++] = new CompFriend2("JUNG", "MD", "010-6666-6666");

        for(int i = 0; i < cnt; i++) {
            frns[i].showInfo();
            System.out.println();
        }
    }
}
