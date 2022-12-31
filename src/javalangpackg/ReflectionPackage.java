
package javalangpackg;
import java.lang.reflect.*;
class My{
    
    //Data Memebers or properties of a class My
    public String s1="Hello";
    private double d1=12.99;
    protected float f1=12.3f;
    int i=10;
    
   
    //Constructor of Class My
    public My(){}
    public My(String str1, String str2){}
    public My(int i, int j){}    
    //Note---> if constructrs are private and protected then it will not be shown by calling getConstructor() method. 
    
    //Methods of class My
    public void show(){}
    public int print(String str1, String str2){return 0;}
    public String Hello(int i, int j){return null;}
    
           
}
public class ReflectionPackage {
    
    public static void main(String[] args)  {
      
  
     Class c = My.class; // First Method for using builtin Class in JAVA ,to look inside our own class(i.e My)
        
 //    My m = new My(); ---> Second Method of using builtin Class in JAVA, First create the Object of our own class.
 //    Class c1=m.getClass(); ---> Then assign the refernce of own class to the builtn Class of JAVA by its getClass() method.
     
     
           
          // --> To know our own class we can use getName(). 
         // it will give our class name as well the package name.
         System.out.println(c.getName()); 
         
         System.out.println("---------DATA MEMBERS--------------");
         
         
         // To know our data members we can use getDeclaredFields().
            Field field[]=c.getDeclaredFields();
                for(Field x : field)
                {
                System.out.println(x);
                } 
                
                
        System.out.println("-----------CONSTRUCTOR'S--------------");
        
        
        
        // To Know our Constructors of class My we can use getConstructors().
           Constructor con[]= c.getConstructors();
           for(Constructor y : con){
               System.out.println(y);
           }
           
           System.out.println("----------METHOD'S---------------");
           
       // To know our Methods of class My we can use getMethods().
         Method meth[]=c.getMethods();
         for(Method z :meth){
             System.out.println(z);
         }
         
          System.out.println("----------METHOD PARAMETER---------------");
          
         Parameter param[]=meth[0].getParameters();
            for(Parameter p : param){
             System.out.println(p);
         }
    }
    
}
