/*
	Stack<Integer> stk = new Stack<Integer>();
	
	1. stk.setSize() //dont use
	2. stk.push(val)
	3. x = stk.pop()
	4. stk.empty()
	5. stk.size()
*/
import java.util.*;
import java.lang.*;
class stack{
    public static void main(String [] args){
        Stack<Integer> stk = new Stack<Integer>(); 
		
		int SIZE  = 10;
		
		int count=0;
		
		int input=0;
		Scanner sc = new Scanner(System.in);
		int x = 0;
		while(input!=5){
			System.out.println("\n1:push | 2: pop | 3: peek | 4: check empty | 5:exit\n");
			input = sc.nextInt();
			switch(input){
				case 1: 
				
					if(count==SIZE){
						System.out.println("Stack is full, cant push!");
					}
					else{
						System.out.println("Enter value: ");
						x = sc.nextInt();
						System.out.println("Pushed "+x);
						stk.push(x);
						count++;
					}
					
				break;
				
				case 2: 
					if(stk.empty()){
						System.out.println("Stack is empty, cant pop!");
					}
					else{
						System.out.println("Popped: "+stk.pop());
						count--;
					}
				
				break;
				
				case 3: 
					if(stk.empty()){
						System.out.println("Empty, nothing to peek!");
					}
					else{
						System.out.println("Peeked value: "+stk.peek());
					}
					
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
