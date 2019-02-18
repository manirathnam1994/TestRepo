/**
 * 
 */
package Singleton;

/**
 * @author Manirathnam
 *
 */
public class Singleton
{


	private static Singleton singleInstance = null;
	
	public static String str = "";
	
	private Singleton(){
		
		str = "I am in singleton class";
	}
	
	public static Singleton getInstance(){
		
		if(singleInstance == null){
			
			singleInstance = new Singleton();
		}
		return singleInstance;
	}
}


