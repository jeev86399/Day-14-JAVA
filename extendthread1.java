import java.util.*;
class a extends Thread{
    public void r(){
        System.out.println("Hello I'am Thread");
    }
}
public class extendthread1{
    public static void main(String args[]){
        a g=new a();
        g.r();
        g.start();
    }
}