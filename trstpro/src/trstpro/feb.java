package trstpro;

 enum Element{

HeLIUM("he", "Gas");

Element(String string, String string2) {
	// TODO Auto-generated constructor stub
}
}


public class feb {
 String f="f";
 String s=new String ("f");
 
	


	  public static int lengthOfLongestSubstring(String s) {
	      
	        String nonrep="";
	        String finalst="";
	        char[] c=s.toCharArray();
	        int start=0;
	        while(start<=c.length)
	        {
	        
	        	for(int i=start;i<c.length;i++)
	        { 
	        	if(!nonrep.contains(Character.toString(c[i])))
	        	{
	        		nonrep=s.substring(start,i);
	        	}
	        }
	        if(nonrep.length()>finalst.length())
	        {
	        	finalst=nonrep;	
	        }
	        start++;
	        }
	        System.out.println(nonrep);
	        return 0;
	    }



}
