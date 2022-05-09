import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class ItrDemo {

	public static void main(String[] args) {
		
		Set hs = new HashSet();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(hs);
		}
	}

