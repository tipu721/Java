package array;


import java.nio.charset.StandardCharsets;
import java.sql.Array;

public class TestArray {

    static void modifyArray(int crr[]){
        for(int i=0; i<crr.length; i++){
            crr[i] += i;
        }
    }

    static void printAnonymousArray(int[] ar){
        for (int item : ar) {
            System.out.println(item);
        }
    }

    static int[] copyArry(int[] crr) {
        int[] newArray = new int[10];
        for (int i=0; i<crr.length; i++){
            newArray[i] = crr[i];
            System.out.println(newArray[i]);
        }
        return newArray;
    }

    public static void main(String[] args) {


        int arr[] = {1, 2, 3,4, 5};
        int brr[] = arr; //copy reference
        int[] crr = new int[5];
        for(int i=0; i<brr.length; i++){
            System.out.println(brr[i]);
            crr[i]=brr[i]; //copy array value
        }
        modifyArray(brr);
        System.out.println("value changed after method call");
        for(int i=0; i<brr.length; i++){
            System.out.println(brr[i] + " "+ arr[i] +" "+ crr[i]);
        }
        printAnonymousArray(new int[]{1, 3, 5, 7});

        copyArry(crr);

        System.out.println(crr.getClass().getName());

    }


}
