
package javalangpackg;


public class StringBuffer_StringBuilder {
    
    public static void main(String[] args) {
        
         String s1= new String("Hello");
         StringBuffer s2= new StringBuffer("Hello");
         StringBuilder s3= new StringBuilder("Hello");
        
         
         s1.concat("World"); // String class have concatenate method
         s2.append("World"); // String Buffer have append method for concatenation.
         s3.append("World"); // String Builder have append method for concatenation.
         
            System.out.println(s1); // it will gives output as Hello , 
            //although it have concatenate the two string but it will create a new object of it but there will no change in S1.
           
            System.out.println(s2); // it will gives output as HelloWorld
            System.out.println(s3); // it will gives output as HelloWorld
         
        
        
    }
    
}
