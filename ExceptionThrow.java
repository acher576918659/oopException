package tw.aaa.myproject.OOP.Exception;

class cat {
	public void play() {
		System.out.println("cat play ball");
	}
}

class kitty extends cat {

}

class dog {
	public void bark() {
		System.out.println("dog bark");
	}
}

public class ExceptionThrow {
	public void processAction() throws ClassCastException, Exception {
		Object a = new kitty();
		dog d1 = (dog) a;
		d1.bark();
	}

	public static void main(String[] args) {//throws Exception{
		ExceptionThrow c = new ExceptionThrow();
		try {
			c.processAction();
		} catch (Exception e) {
			System.out.println("finished");
		}
	}
}
