import java.util.*;
public class Single{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number:");
       int a = sc.nextInt();
       System.out.println("enter another number:");
       int b = sc.nextInt();
       Moni mm = new Moni();
       System.out.println("sum:"+mm.display1(a,b));
        System.out.println("sub:"+mm.display2(a,b));
      
    }
}
class Deva{
   int display1(int a ,int  b){
    int c =  a + b;
       return c;
    }
} 
class Moni extends Deva{
    int display2(int a, int b){
      return a-b;
    }
}   
