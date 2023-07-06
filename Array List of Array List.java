/******************************************************************************
.size() -> gets the sze of the list
.get(i).get(j) -> retrieves the elements from the sublists inside the main list
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		List<List<String>> items = new ArrayList<>();
		
		List<String> l1 = new ArrayList<>();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		
		List<String> l2 = new ArrayList<>();
		l2.add("1");
		l2.add("2");
		l2.add("3");
		
		items.add(l1);
		items.add(l2);
		
		for(int i=0;i<items.size();i++){
		    for(int j=0;j<items.get(i).size();j++){
		        System.out.println(items.get(i).get(j));
		    }
		}


			(OR)

		for(List<String> s : items) { s.get(0) etc }  //This is also valid		
	}
}
