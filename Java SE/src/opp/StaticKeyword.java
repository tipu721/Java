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


}

public class StaticKeyword {

    public static void main(String[] args) {

        Student s1 = new Student(01, "Tipu");
        Student s2 = new Student(02, "Tipu2");

        System.out.println(s1.name+" "+s1.rollno+" "+Student.college);
        System.out.println(s2.name+" "+s2.rollno+" "+Student.college);

    }
}
