package designpattern;

class Student{

    String name;
    Integer id;
    String department;

    public Student(String name, Integer id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                '}';
    }
}

class StudentBuilder{
    String name;
    Integer id;
    String department;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }
    public Student getPhone(){
        return new Student(name, id, department);
    }
}
public class Builder {

    public static void main(String[] args) {
        Student student = new StudentBuilder().setId(101).setDepartment("ICT").getPhone();
        Student obj2 = new StudentBuilder().setDepartment("CSE").getPhone();
        System.out.println(student);
        System.out.println(obj2);
    }
}
