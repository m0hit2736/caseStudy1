package AssignDay11;
import java.util.*;
public class LinkedListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		System.out.println(ll.isEmpty());
        // Adding elements to the linked list
        ll.add("A");
        ll.add(40);
        ll.addLast("C");
        ll.addFirst(5.5);
        ll.add(2, "E");
        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.contains(45));
        System.out.println(ll.getFirst());
        
        List<String> names = new LinkedList<>();
        names.add("mohit");
        names.add("gupta");
        names.add("ravi");
  
        
        ListIterator<String> namesIterator
            = names.listIterator();
  
        
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }
	}

}
