import java.util.*;
public class ArrayListExample{
    public static void main(String[] args) {
     HashMap<String,String> map= new HashMap<>();
     map.put("DD'S Bakery","Devadharshini");
     map.put("VM'S Bakery","Monisha");
     map.put("SS'S Bakery","Santhoshini");
     System.out.println(map);
     System.out.println("keys:"+map.keySet());
     System.out.println("Values:"+map.values());
     System.out.println(map.entrySet());
     for(Map.Entry<String,String>m:map.entrySet()){
             
             System.out.println(m.getKey()+" "+m.getValue());
            
     }
        
    }
}