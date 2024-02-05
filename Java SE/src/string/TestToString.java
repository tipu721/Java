package string;
class Person{
    Integer id;
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class TestToString {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.id = 1001;
        p1.name = "Tipu";
        String s1 = "Rajbari";
        String s2 = new String("Dhaka");
        System.out.println(p1);
        System.out.println(s1);
        System.out.println(s2);


    }
}
