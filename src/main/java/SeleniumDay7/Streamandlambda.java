package SeleniumDay7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streamandlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names= new ArrayList<String>();
		names.add("Bhanu");
		names.add("Babblu");
		names.add("Banti");
		names.add("Ananth");
		names.add("Abby");
		Long c=names.stream().filter(s->s.startsWith("B")).count();
		System.out.println(c);
		
		Long c1=Stream.of("Bhanu","Bubblu","Banti","Abby","Ananth").filter(s->
		{
			s.startsWith("B");
			return true;
		}).count();
		System.out.println(c1);
		//print all the names in the list where the length of the name greater than 4
//		Stream.of("Bhanu","Bubblu","Banti","Abby","Ananth").filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}

}
