
//Wrapper Class --> Wrapper class is inside the java.lang package.
//The conversion of all the (8-primitive data types) into the objects is called as Wrapper class.
// The wrapper class works same like primitive data types.
// Java craeted wrapper class to use these primitive data type as objects as in java evyrthing revolve around references of the objects.
// Wrapper class 2 things we need to remember: 1>Autoboxing 2>Unboxing
// 1> Autoboxing->> A primitive data assign to object is called as Autoboxing.
// 2> UnBoxing->>  objects is assign to primitive is called AutoUnboxing.

package javalangpackg;


public class Wraperclass {
    
    public static void main(String[] args) {
        
        // 1.Integer Wrapper object
        
        int i = 10; // Primitive data decalaration.
        Integer k=i; // Primitive data assign to object(k)-->Autoboxing.
        int j=k; // Object assign to primitive data type(j)-->Autounboxing.
        System.out.println(k);//---> output will be int primitive data type (10).
        
        Integer h = 10; // Assigning Wrapper class Integer as object. This is how we use to declare the wrapper class.
        
        Integer d = Integer.valueOf("12"); // converting the String to Integer value for wraper class objects.
        System.out.println(d+1); // (d+1 , bcuz to chk if the string is converted into integer or not)
     
        //This is the Integer.(String,radix) method of Integer Class , Where we pass a staring against its radix.
        // Radix basically means base of number system.
        Integer d1 = Integer.valueOf("1010",2);
        System.out.println(d1);
        
        // This Integer.parseInt(String)--> which convert the string into a number.
        Integer d3 = Integer.parseInt("211");
        System.out.println(d3);
       
        Integer d4 = Integer.reverse(128);
        System.out.println(d4);
        System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
         
         
        // 2. Byte Wrapper class object
        
        Byte s= 12;
        
        Byte r= Byte.valueOf("12");
        System.out.println(r);
        
        // 3. Character wrapper class object
        
        Character w ='S';
        System.out.println(w);
        Character c = Character.valueOf('l');
        System.out.println(c);
        
        
        //4. Float Wrapeer class object
        
        float e =12.5f; // Primitive data type
        Float j1=12.5f; // Wrapper class Object Float
        System.out.println(j1.equals(e));
        
        Float j2=13.7f/0; // Note: For float value divided by 0 will not have Exceptions.
        System.out.println(j2.isInfinite());
        
        
    }
    
}
