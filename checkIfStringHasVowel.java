import java.util.*;
class test{
    public static void main(String [] args){
        String a = "cat";
		
		int l = a.length();
		
		String b = a.toLowerCase();
		
		int c=0;
		for(int i=0;i<l;i++){
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
				c++;
			}
		}
		
		System.out.println("Number of vowels in string: "+ c);
    }
}
