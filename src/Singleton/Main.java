/**
 * 
 */
package Singleton;

/**
 * @author Manirathnam
 *
 */
class Main 
{ 
    public static void main(String args[]) 
    { 
        // instantiating Singleton class with variable x 
        Normal x = Normal.getInstance(); 
  
        // instantiating Singleton class with variable y 
        Normal y = Normal.getInstance(); 
  
        // instantiating Singleton class with variable z 
        Normal z = Normal.getInstance(); 
  
        // changing variable of instance x 
        x.str = (x.str).toUpperCase(); 
  
        System.out.println("String from x is " + x.str); 
        System.out.println("String from y is " + y.str); 
        System.out.println("String from z is " + z.str); 
        System.out.println("\n"); 
  
        // changing variable of instance z 
        z.str = (z.str).toLowerCase(); 
  
        System.out.println("String from x is " + x.str); 
        System.out.println("String from y is " + y.str); 
        System.out.println("String from z is " + z.str); 
    } 
} 