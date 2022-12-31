
package javalangpackg;


public class enum_class { 
    
    public enum Month //enum class created, it can be public , private , protected and default as well.
    {
        
        JAN(1), FEB(2) ,MAR(3) ,APR(4) ,MAY(5);
    
        private int value; //-->This also to be private if constuctor is private, bcuz pass this value to constructor. 
    
        private Month(int value) // constructor->>private by default hota hain
        {
         this.value=value;
        }
    }
    public static void main(String[] args) {
        
        for(Month m : Month.values()) // using for each loop
        System.out.println(m+" "+m.value); // Gives output for value assign to constants
        // for each loop ka scope khatam hua so m will not use as refernce anymore.
        
        
        // Gives ordinal of Month. Matalb array indexing jise hum ordinal khete hain in enumeration.
        System.out.println(Month.JAN.ordinal()); 
        System.out.println(Month.FEB.ordinal());
        System.out.println(Month.MAR.ordinal());
        System.out.println(Month.APR.ordinal());
        System.out.println(Month.MAY.ordinal());
    }
    
}
