package demo;

class EvenThread extends Thread{

    public EvenThread(int value){
        System.out.println(value);
    }

    public EvenThread() {

    }
}
class OddThread extends Thread{

    public static void print(int value){
        System.out.println(value);
    }
}
class PrintMethod{
     synchronized static void print(int value){

         if(value % 2 == 0){
             EvenThread e = new EvenThread(value);
         }else {
             System.out.println(value);
         }
     }
}
public class EvenAndOdd {
    public static void main(String[] args) throws InterruptedException {
        EvenThread e = new EvenThread();
        OddThread o = new OddThread();

        for (int i =0;i<=100;i++){
            PrintMethod.print(i);
            e.run();
            o.run();

        }

    }

}
