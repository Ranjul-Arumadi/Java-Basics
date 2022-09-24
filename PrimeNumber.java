import java.util.*;
class test{
    public static void main(String [] args){
        int a = 5;
		
		if(a==0 || a==1){
			System.out.println("Not prime");
			System.exit(0);
		}
		else if(a==2){
			System.out.println("Prime");
			System.exit(0);
		}
		
		for(int i=2;i<a/2;i++){
			if(a%i==0){
				System.out.println("Not prime");
				System.exit(0);
			}
		}
		
		System.out.println("Prime");
    }
}
