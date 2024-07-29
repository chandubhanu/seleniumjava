package SeleniumDay7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streamcollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names= new ArrayList<String>();
		names.add("Bhanu");
		names.add("Babblu");
		names.add("Banti");
		names.add("Ananth");
		names.add("Abby");
		List<String> ls=names.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
	}

}
