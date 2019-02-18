/**
 * 
 */
package Singleton;

/**
 * @author Manirathnam
 *
 */
public class Normal
{
	private static Normal singleInstance = null;
	
	public static String str = "";


	
	private Normal(){
		
		str = "I am in singleton class";
	}
	

	
	public static Normal getInstance(){
		
		if(singleInstance == null){
			
			singleInstance = new Normal();
		}
		return singleInstance;
	}
}
