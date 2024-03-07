/***  This is documentation for Java Hello world program */
public class HelloJava{
      /*** This is main method of java Hello World source file */
      public static void main(String[] args){

          System.out.println("Hello !");
          args[0] = "Sultan";
          args[1] = "Tipu";
          System.out.println(args.length);
          for(int i=0; i<args.length; i++){
              System.out.println(args[i]);
          }

      }
}