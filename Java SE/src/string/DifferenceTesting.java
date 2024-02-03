package string;

public class DifferenceTesting {


    static String concatWithString() {
        String str = "Tipu";
        for(int i=0; i<1000; i++){
            str = str + " Sultan";
        }

        return str;

    }

    static StringBuilder concatWithStringBuidler() {
        StringBuilder sbd = new StringBuilder("Tipu");
        for(int i=0; i<1000; i++){
            sbd.append(" Sultan");
        }
        return  sbd;
    }

    static StringBuffer concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("Tipu");
        for(int i=0; i<1000; i++){
            sb.append(" Sultan");
        }
        return  sb;
    }


    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        concatWithString();
        System.out.println("Time taken with string " + (System.currentTimeMillis() - startTime)+"ms");

        startTime = System.currentTimeMillis();
        concatWithStringBuidler();
        System.out.println("Time taken with string builder "+ (System.currentTimeMillis() - startTime)+"ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken with string buffer "+ (System.currentTimeMillis() - startTime)+"ms");



    }



}
