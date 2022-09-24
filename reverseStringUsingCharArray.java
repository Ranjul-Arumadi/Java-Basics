import java.util.*;
class test{
    public static void main(String [] args){
        String a = "ranjul";
		String ans = "";
		
		char t[] = a.toCharArray();
		
		int l = t.length;
		
		for(int i=l-1;i>=0;i--){
			ans+=t[i];
		}
		
		System.out.println(ans);
    }
}
