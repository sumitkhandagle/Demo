import java.awt.RenderingHints.Key;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.omg.CORBA.MARSHAL;

class B extends A{
	 public B() {
		// TODO Auto-generated constructor stub
	}
	 
	 @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	 
	 public static void main(String args[]) {
		List<String> s = new ArrayList<>();
		Map<Integer, String> map = new HashMap<>(20);
		map.put(99, "comparingByValue");
		map.put(100, "abc");
		
		Set<Integer> keySet = map.keySet();
		
		for(int i :keySet) {
		System.out.println(  map.get(new Integer(i)));
			
		}
	 }
}
