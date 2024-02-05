package threads;

class Table{
   synchronized void printTable(int n, int m){//synchronized method
        for(int i=n; i<m; i++){
            System.out.println(i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class MyThread1 extends Thread{

    Table table;
    MyThread1(Table table){
        this.table = table;
    }

    public void run(){
        table.printTable(1, 10);
    }
}
class MyThread2 extends Thread{

    Table table;
    MyThread2(Table table){
        this.table = table;
    }
    public void run(){
        table.printTable(10, 20);
    }

}
public class MainThread {

    public static void main(String[] args) {

        Table table = new Table();
        MyThread1 thread1 = new MyThread1(table);
        MyThread2 thread2 = new MyThread2(table);

        thread1.start();
        thread2.start();

    }

}
