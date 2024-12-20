class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("destroyed " + name);
    }
}

public class ObjectFinalize {
    public static void main(String[] args) {
        Person p1 = new Person("Yoon");
        Person p2 = new Person("Park");

        p1 = null;  //참조대상을 GC의 대상으로 만듬
        p2 = null;  //참조대상을 GC의 대상으로 만듬
    }
}
