package Inheritence;

interface A {
	default void show() {
		System.out.println("Interface A");
	}
}
interface B extends A{
	default void show() {
		System.out.println("Interface B");
	}
}

interface C extends A{
	default void show() {
		System.out.println("Interface C");
	}
}

class D implements B,C{
	public void show() {
		System.out.println("Class D resolves Diamond problem.");
	}
}

public class Interface{
	public static void main(String[] args) {
		D obj = new D();
		obj.show();
	}
}
