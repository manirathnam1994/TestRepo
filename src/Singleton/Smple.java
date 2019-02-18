/**
 * 
 */
package Singleton;

/**
 * @author Manirathnam
 *
 */
public class Smple
{
	
	 protected boolean isAmendOperation(){
		 return false;
		 
	 }
	 
		 public void create(){
			 if(isAmendOperation()){
				 System.out.println("ctffafhf");
			 }else{
				 System.out.println("dddddddddd");

			 }
		 }

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Smple s = new Smple();
		s.create();
		
	}

}
