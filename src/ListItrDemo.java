import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class ListItrDemo {
	

	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		
		System.out.println(li);
		
		ListIterator itr = li.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		itr.add(35);
		System.out.println(li);
		itr.previous();
		itr.remove();
		System.out.println(li);
		
		System.out.println("_____________________");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}		
		itr.add(25);
		System.out.println(li);
		
		}
	}


