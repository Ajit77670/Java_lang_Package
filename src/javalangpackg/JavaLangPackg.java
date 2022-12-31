
package javalangpackg;
import java.lang.*;


public class JavaLangPackg {

    public static void main(String[] args) {
        
        //1.equals() method of Object class is used for refernce comparision.
       
        //Example:1
        Object obj1 = new Object();
        Object obj2 = new Object(); 
        System.out.println(obj1.equals(obj2)); // Output will be false as both objects are  having unique hashcode assign by JVM. 
      
        // will use proper equals() method for object comparision and 
        //for primitive data types will use identity opertaor(==)
        
        //1.a equals() method as identity operator(==)
            int i=10;
            int j=10;
            System.out.println(i == j); //output true
        
      
      /* Example:2
       Object obj2 = obj1;                       // This equal comaprision will gives true value as true
       System.out.println(obj1.equals(obj2));   //because both the object referening to the same object.
                                                // the true comaprision we can get with the help of equals() method only.
       */ 
      
      //2. hashcode() method of object class
      
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
      
      //3. toString() method of Object class
      
      System.out.println(obj1.toString());
      System.out.println(obj1);
    // By default java converts the object refernce to toString if we not convert toString also.
    // So whenever we print an object it will call toString method of class implicitly
    
    
    
    
    }
}