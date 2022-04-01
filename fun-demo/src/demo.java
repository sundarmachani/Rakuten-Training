@Functionalnterface
interface MyFunctionalInterface {
	void count();
}

class imp1 implements MyFunctionalInterface{
	@override
	public void count() {
		System.out.println("called");
		
	}
}
public class demo {
	public static void main(String[] args) {
		MyFunctionalInterface imp1 = () -> System.out.println("called");
		imp1.count();
		
	}

}
