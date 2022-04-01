package test;

public class InnerClass {
	static class A {
		String name;
		int age;
	}
	public static void main(String[] args) {
		InnerClass.A a= new InnerClass.A();
		System.out.println(a.name);
		System.out.println(a.age);
	}
}
