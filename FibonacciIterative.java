import java.util.*;
class test{
    public static void main(String [] args){
        int n=5;
		// 0 1 1 2 3 5 8
		int a=0, b=1,c=0;
		
		while(n>0){
			a = b;
			b = c;
			c = a+b;
			n--;
		}
		
		System.out.println(c);
    }
}
