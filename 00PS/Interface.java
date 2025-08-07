public class Interface {
    public static void main(String[] args) {
        Dairy dk = new Dairy();
       System.out.println(dk.eater);
       dk.eating();
}
}
 interface  Kitkat{
    void eating ();
    int eater = 10;
   
}
class Dairy implements Kitkat{
       public void eating()
       {
         System.out.println("Kitkat is my Favourite one!");
       }
}