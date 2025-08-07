public class Hierarchical {
    public static void main(String [] args)
{
    b dd = new b();
    dd.display1();
    dd.display2();
    c ee = new c();
    ee.display3();
}
}
class a{
    void display1()
    
    {
        System.out.println("deva");
    }
}
class b extends a{
     void display2()
     {
        System.out.println("moni");
     }
}
class c extends a{
    void display3()
     {
        System.out.println("santo");
     }

}
