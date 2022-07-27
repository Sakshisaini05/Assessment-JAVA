
public class Demo2 {
   boolean CheckPalindrome(String s) {
	   char ch[]=s.toCharArray();  
	   String ans="";
	   for(int i=ch.length-1;i>=0;i--){  
	        ans+=ch[i];  
	    }  
	if(ans.equals(s))
	{
		return true;
	}
	
	else 
	{
		return false;
	}
   }
}
