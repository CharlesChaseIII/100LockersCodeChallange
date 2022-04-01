package rev.com.chall;

public class Lockers {

	public void openCloseLockers() {

		  String[] lockersOpenedClosed = new String[100];

		  int count = 0;
		  
		  int count2 = 0;
		  
		  int accum = 1;

		   for (int i = 0; i < 100; i++) {
		     
		          lockersOpenedClosed[i] = "open";
		     
		     }
		   
		   //System.out.print(lockersOpenedClosed.length);
		   //int iter2 = 1;
		   
 for (int iter2 = 1; iter2 < lockersOpenedClosed.length; iter2++) {
			     
	          while(accum < 100) {
		       if (iter2 % accum == 0) {
		    	   

		        if (lockersOpenedClosed[iter2].equals("open")) {
		        	   
		        	lockersOpenedClosed[iter2] = "close";
		        	
		        	count2++;
		        	//System.out.print(count2);
		        	//System.out.print(lockersOpenedClosed[iter2]);
		        } else {
		        	lockersOpenedClosed[iter2] = "open";
		        	//System.out.print(lockersOpenedClosed[iter2]);
		        }
		    	    
			   
		     
		     }
		       accum++;
		      
	          }
	          
	          
	          
	         /* if(iter2 == lockersOpenedClosed.length) {
	        	  if (lockersOpenedClosed[iter2].equals("open")) {

	        	      lockersOpenedClosed[iter2] = "close";

	        	      } else {

	        	      lockersOpenedClosed[iter2] = "open";
	        	     
	        	      }
	          }*/
		     
		   
		   /*for (int iter2 = 0; iter2 < 100; iter2++) {
			     
		       if (iter2 % accum == 0) {
		    	    
			   lockersOpenedClosed[iter2] = "open";*/
		     
		     }
		   
	for (int iter3 = 0; iter3 < lockersOpenedClosed.length; iter3++) {
		if (lockersOpenedClosed[iter3].equals("open")) {
			count++;
		}
	  }
	
	   System.out.print("There are " + count + " lockers open.");
	}
	
	
}
