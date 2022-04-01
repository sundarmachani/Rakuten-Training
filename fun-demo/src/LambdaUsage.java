import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.forEach((Integer element)->{
			System.out.println(element);
		});
		System.out.println("--- sorting---");
		list.sort(new comparator<integer>() {
			@override
			public int compare(Integer arg0, Integer arg1) {
				return (arg0 - arg1);
			}
		});
		System.out.println(list);
		
	}
}
