import java.util.*;
class a implements Runnable{
    public void run(){
        System.out.println("Hello I'am Thread");
    }
}
public class implementthread2{
    public static void main(String args[]){
        a r=new a();
        Thread s=new Thread(r);
        s.start();
        s.run();
    }
}