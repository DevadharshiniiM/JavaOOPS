import java.util.*;
public class Multilevel{
    public static void main(String[] args)
    {
     c dd = new c();
     dd.display1();
     dd.display2();
     dd.display3();
}
}
class a
{
     void display1(){
        System.out.println("deva");
     }
}
class b extends a{
 void display2(){
        System.out.println("moni");
     }
}
class c extends b{
 void display3(){
        System.out.println("santo");
     }
}
