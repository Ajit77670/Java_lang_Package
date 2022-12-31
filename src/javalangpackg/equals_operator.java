
package javalangpackg;


public class equals_operator {
    
    public static void main(String[] args) {
        
        
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");
        String s6 =  new String("HELLO");
        
        System.out.println(s3.equals(s6));// true--> its chks the string content.
 
        System.out.println(s1 == s2); // true --> Both refrening to same memory location
        System.out.println(s1 == s3); // false--> bcuz s1 and s3 are created in two differnt memory , 
                               //one in string pool and another in heap. so they have different memory adddress.
                               
        System.out.println(s1.equals(s2)); // true--> the content of both the objects s1 and s2 is same.
        System.out.println(s1.equals(s3));//true--> s1 and s3 are having differnt memory locations.
        
         // String comparision using equals()method. 
         //equals() method in case of String used for content/value comparision.
         // we cannot make use of(==) operatot for string content comparision , 
         //its use for comparing the address references for two strings or objects.
         String s4 = "Ajit";
         String s5 ="Ajit";
         System.out.println(s4.equals(s5)); // This checks object value is same or not.
         System.out.println(s4==s5); // This will check the address for both objects same or not.
    }
    
}
