import java.util.*;
public class Inheritance{
    public static void main(String[] args)
    {
       Moni mm = new Moni();
       mm.display1();
       mm.display2();
    }
}
class Deva{
    void display1(){
        System.out.println("hi 1 st class");
    }
} 
class Moni extends Deva{
    void display2(){
        System.out.println("hi second class");
    }
}   
