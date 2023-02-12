import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Square {
	public static void main(String[] args) {
		List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> result = mylist.stream().map(e -> e*e).collect(Collectors.toList());
		System.out.println(result);
	}

}
