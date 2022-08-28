import java.util.*;
import java.lang.*;
class stack{
    public static void main(String [] args){
        Stack<Integer> stk = new Stack<Integer>(); 
		int input=0;
		Scanner sc = new Scanner(System.in);
		int x = 0;
		while(input!=5){
			System.out.println("\n1:push | 2: pop | 3: peek | 4: check empty | 5:exit\n");
			input = sc.nextInt();
			switch(input){
				case 1: 
				System.out.println("Enter value: ");
				x = sc.nextInt();
				System.out.println("Pushed "+x);
				stk.push(x);
				break;
				
				case 2: 
				System.out.println("Popped: "+stk.pop());
				break;
				
				case 3: 
				System.out.println("Peeked value: "+stk.peek());
				break;
				
				case 4: 
				System.out.println("Is empty: "+stk.empty());
				break;
				
				case 5:
				System.out.println("Exiting..");
				System.exit(0);
				
				default: System.out.println("ERROR input");
			}
		}
	}
}
