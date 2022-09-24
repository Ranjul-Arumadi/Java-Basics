import java.util.*;
class test{
    public static void main(String [] args){
        String a = "ranjul";
		
		int c=0;
		char x=' ';
		try{
			for(int i=0;;i++){
				x = a.charAt(i);
				c++;
			}
		}
		catch(Exception e){
			
		}
		finally{
			System.out.println(c);
		}
    }
}
