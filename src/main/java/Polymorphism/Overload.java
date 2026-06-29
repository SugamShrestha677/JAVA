package Polymorphism;


class Demo{
	void add(int a) {
		System.out.println(a);
	}
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
}

public class Overload {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.add(10);
		d.add(10+30);
	}

}
