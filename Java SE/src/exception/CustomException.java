package exception;

class AgeInvalidException extends Exception{
   AgeInvalidException(String msg){
       super(msg);
   }
}

public class CustomException {

    public static void main(String[] args) {
        int a = 18;
        if(a < 25){
            try {
                throw new AgeInvalidException("Smaller age");
            } catch (AgeInvalidException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Rest of the code");
    }
}
