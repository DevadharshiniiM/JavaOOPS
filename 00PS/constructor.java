import java.util.*;
class constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        System.out.println("enter a string:");
        String b = sc.next();
        Deva mm = new Deva(a,b);
        mm.display();
       
}
}

class Deva{
   int num;
   String name;
   Deva(int A, String B){
    num=A;
    name =B;
   }  
    void display(){
         System.out.println("number: " + num);
         System.out.println("name: " + name);
    }

} 

