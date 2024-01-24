package opp;

public class ObjectCopy {

    Integer id;
    String name;

    ObjectCopy(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    ObjectCopy(){

    }

    ObjectCopy(ObjectCopy obj){
        this.id = obj.id;
        this.name = obj.name;
    }

    public static void main(String[] args) {

        //Copy object with constructor
        ObjectCopy obj1 = new ObjectCopy(01, "Tipu");
        System.out.println(obj1.id + " "+ obj1.name);

        ObjectCopy obj2 = new ObjectCopy();
        System.out.println(obj2.id +" "+ obj2.name);


        ObjectCopy obj3 = new ObjectCopy(obj1);
        System.out.println(obj3.id +" "+obj3.name);



    }
}
