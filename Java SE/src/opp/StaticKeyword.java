package opp;


class Student{

    int rollno;
    String name;
    //static variable create class level one time
    // take memory once
    static String college = "MBSTU";

    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }


//    void change(){
//        college = "RU";
//    }
    static void change(){
        college = "DU";
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}

class Counter{
    int counter1 = 0;
    static int counter = 0;
    Counter(){
        counter1++;
        counter++;
        System.out.println("coutner1:"+counter1+ " "+"coutner:"+counter);
    }


}

public class StaticKeyword {

    public static void main(String[] args) {

        Student s1 = new Student(01, "Tipu");
        Student s2 = new Student(02, "Tipu2");

        System.out.println(s1.name+" "+s1.rollno+" "+Student.college);
        System.out.println(s2.name+" "+s2.rollno+" "+Student.college);


        System.out.println("static vs non static variable");
        Counter c1 = new Counter();
        Counter c2 = new Counter();


        System.out.println("college value change for non static vs static method");
        s1.change();
        System.out.println(s1 + Student.college);
        System.out.println(s1 + Student.college);
        System.out.println(s2 + Student.college);



    }
}
