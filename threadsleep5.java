import java.util.*;
public class threadsleep5{
    public static void main(String args[]){
        System.out.println("Thread started...");
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Thread resumed");
    }
}