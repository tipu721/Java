package enuma;

enum EID{
    EDULFITH(1), EDULAZHA(2);
    private int value;
    EID(int value) {
        this.value = value;
    }
}

public class EnumExample1 {

    //enum inside class

    private int value;
    enum Season{
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {
        for(Season s : Season.values()){
            System.out.println(s);
        }
        System.out.println(Season.valueOf("WINTER").ordinal());

        for(EID eid : EID.values()){
            System.out.println(eid);
        }
    }
}
