
public class happyno {

	public static void main(String[] args)
	{
	      int no =19;
	      int total=0;
	      int temp =0;
	      int rem=0;
	      while(no >9)
	      {
	    	  while(no >0)
	    	  {
	    		  rem = no%10;
	    		  temp = rem *rem;
	    		  total = total+temp;
	    		 no = no/10;
	    	  }
	    	  
	    	  no = total;
	    	  total =0;
	      }
	      System.out.println(no);
	      if(no==1)
	      {
	    	  System.out.println("happy no");
	      }
	      else
	      {
	    	  System.out.println("not happy no");
	      }
	      
	      
	    	  
	      

	}
	
	    	  
	    

}
