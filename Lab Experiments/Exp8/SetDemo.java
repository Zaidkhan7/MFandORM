package Collections_injection;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<C> set = new HashSet<>();
		C obj = new C();
		obj.setA(100);
		set.add(obj);
		C obj2 = new C();
		obj2.setA(100);
		set.add(obj2);
		
		C obj3 = new C();
		obj3.setA(200);
		set.add(obj3);
		//System.out.println(obj3);
		
		Set<Integer> set2 = new HashSet<>();
		Integer i = new Integer(100);
		set2.add(i);
		Integer j = new Integer(200);
		set2.add(j);
		Integer k = new Integer(100);
		set2.add(k);
		System.out.println("set:"+set);
		System.out.println("set2:"+set2);

	}

}
