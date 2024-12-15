import java.util.*;
public class lamdathread3{
    public static void main(String args[]){
        Runnable r=()->System.out.println("I'am new from java version" );
        Thread t=new Thread(r);
        t.start();
    }
}