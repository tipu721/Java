package oopMisc;

public class TestObjectClone implements Cloneable{
    
    Integer id ;
    String name;

    public static void main(String[] args) {
        TestObjectClone obj1 = new TestObjectClone();
        TestObjectClone obj2 = null;
        // deep copy
        try {
            obj2 =(TestObjectClone) obj1.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        
        System.out.println(obj1 + " "+obj2);

        
        
    }
   

}
