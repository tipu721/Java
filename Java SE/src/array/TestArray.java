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

        //array copy vs clone
        System.out.println("array copy vs clone");
        char[] copyFrom = {'a', 'b', 'c', 'd', 'e'};
        char[] copyTo = new char[8];
        System.arraycopy(copyFrom, 2, copyTo, 3, 3);
        for(char item : copyTo){
            System.out.println(item);
        }
        System.out.println(copyFrom==copyTo);
        char[] cloneTo = new char[10];
        cloneTo = copyFrom.clone();
        for(char item: cloneTo){
            System.out.println(item);
        }
        System.out.println(cloneTo == copyFrom);

        int[][] ar2;
        ar2 = new int[][]{{1, 2}, {3, 4}};
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(ar2[i][j]+" ");
            }
            System.out.println();
        }
        int[][] ar3 = ar2.clone();
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(ar3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(ar3==ar2);

        //java jagged array
        System.out.println("jagged array");
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[2];
        int counter = 0;
        for(int i=0; i < 3; i++){
            for(int j=0; j< jaggedArray[i].length; j++){
                jaggedArray[i][j] = counter++;
            }

        }
        for(int i=0; i < 3; i++){
            for(int j=0; j< jaggedArray[i].length; j++){
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println();

        }


    }


}
