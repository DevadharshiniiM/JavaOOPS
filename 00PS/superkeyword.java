public class superkeyword {
    public static void main(String[] args)
    {
        moni mm = new moni();
    }
}
class deva{
    String name = "deva";
    void display()
    {
        System.out.println("first class");
    }
}
class moni extends deva{
    String name = "moni";
    moni()
    {
        super.display();
       display();
       
    }
    void display()
    {
        System.out.println("second class");
    }
}