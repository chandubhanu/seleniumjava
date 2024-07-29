package SeleniumDay7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names= new ArrayList<String>();
		names.add("Bhanu");
		names.add("Babblu");
		names.add("Banti");
		names.add("Ananth");
		names.add("Abby");
		//print the names last char as U and convert them into  upper case
		//Stream.of("Bhanu","Bubblu","Banti","Abby","Ananth").filter(s->s.endsWith("u")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//print names starts with "a" with uppercase and sort it
		List<String> name= Arrays.asList("Bhanu","Bubblu","Banti","Abby","Ananth");
		//name.stream().filter(s->s.startsWith("B")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		Stream<String>  newstream=Stream.concat(name.stream(), names.stream());
		//newstream.sorted().forEach(s->System.out.println(s));
	Boolean flag=newstream.anyMatch(s->s.equalsIgnoreCase("Bhanu"));
	Assert.assertTrue(flag);
	}

}
