package SeleniumDay7;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class javastreams {
//@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//store the elements in a list  and find the elements in the list which starts with a
		List<String> names= new ArrayList<String>();
		
		names.add("Bhanu");
		names.add("Babblu");
		names.add("Banti");
		names.add("Ananth");
		names.add("Abby");
		int a=0;
		System.out.println(names);
		for(int i=0;i<names.size();i++) {
			String namesactual=names.get(i);
			if(namesactual.startsWith("B"))
			{
				a++;
			}
		}
		System.out.println(a);
	}
@Test
public void streamFilter() {
	List<String> names= new ArrayList<String>();
	names.add("Bhanu");
	names.add("Babblu");
	names.add("Banti");
	names.add("Ananth");
	names.add("Abby");
	Long c=names.stream().filter(s->s.startsWith("B")).count();
	System.out.println(c);
}
}
