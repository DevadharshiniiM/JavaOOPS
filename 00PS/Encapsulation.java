import java.util.*;
public class Encapsulation {
    public static void main(String [] args)
    
    {
          Bank bb = new Bank();
          System.out.println(bb.AccNo);
          bb.AccNo=5678;
          System.out.println(bb.AccNo);

    }
}
class Bank{
   private int AccNo= 1234;
}