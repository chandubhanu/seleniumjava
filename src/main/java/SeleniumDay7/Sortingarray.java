package SeleniumDay7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sortingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<Integer> B = Arrays.asList(3, 2, 2, 3, 5, 4, 7);
       List<Integer> c= B.stream().distinct().sorted().collect(Collectors.toList());
       System.out.println(c.get(2));
	}

}
