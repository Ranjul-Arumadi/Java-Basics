/*
	Queue<Integer> q = new LinkedList<Integer>();
	
	1. poll()  - remove the first element in queue
	2. add()
	3. peek() - just SEE the first element in the queue
	4. isEmpty()
	
*/

import java.util.*;
import java.lang.*;
class queue{
    public static void main(String [] args){
        Queue<Integer> q = new LinkedList<Integer>();
		int size = 5;
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int elem = 0;
		
		do{
			System.out.println("1. add | 2. poll | 3. peek | 4. empty? | 5. exit ");
			choice = sc.nextInt();
			
			switch(choice){
				case 1:
						
						if(count==size){
							System.out.println("Q is full! ");
						}
						else{
							System.out.println("Enter element value: ");
							elem = sc.nextInt();
							q.add(elem);
							System.out.println("Added "+ elem);
							count++;
						}
						break;
						
				case 2: 
						if(q.isEmpty()){
							System.out.println("Q is empty");
						}
						else{
							System.out.println("Removing: "+ q.poll());
							count--;
						}
						break;
						
				case 3: 
						if(q.isEmpty()){
							System.out.println("Nothing to peek!");
						}
						else{
							System.out.println("top value is "+ q.peek());
						}
						break;
				
				case 4: System.out.println("Is empty: "+ q.isEmpty());
						break;
						
				case 5:
						System.out.println("Exiting..");
						System.exit(0);
						
				default: System.out.println("Wrong input");
						
			}
		}while(choice!=5);
			
	}
}
