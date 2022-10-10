import java.util.*;
class test{
    public static void main(String [] args){
    
    /*
      Number of substrings for a string with n letters : (n*(n+1)/2)
      
      For prefix: let the loop run only n times [n = number of letters in the string] 
    */
      
		String s = "abc";
		int l =s.length();
		String ans ="";
		
		int numOfSubStrings = (l*(l+1)) / 2;
		String a[] = new String[numOfSubStrings];
		int pos=0;
		
		// start
		for(int i=0;i<l;i++){
			// end
			for(int j=i;j<l;j++){
				// print from start to end
				for(int k=i;k<=j;k++){
					ans+=s.charAt(k);
				}
				if(ans!=""){
					a[pos++] = ans;
					ans = "";
				}
			}
		}
		
		for(String x: a){
			System.out.println(x);
		}
    }
}
