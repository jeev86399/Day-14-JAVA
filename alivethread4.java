import java.util.*;
public class alivethread4{
    public static void main(String args[]){
        Runnable r=()->System.out.println("I'am new from java version" );
        Thread t=new Thread(r);
        //without start it will print false
        t.start();
        System.out.println(t.isAlive());
        //if we use 2 starts it will show exception
    }
}