package tw.aaa.myproject.OOP.Exception;

public class ExceptionTest {
	int[] data = { 1, 2, 3, 4, 5, 6 };

	public void array() {
		try {
			for (int i = 0; i <= data.length; i++) {
				System.out.printf("data[%d][%d]\n", i, data[i]);
			}
		} catch (ArithmeticException e) {
			System.out.println("ex");
		} catch (Exception e) {
			System.out.println("ex:" + e);
		}
	}

	public void Exception1(int a, int b) {
		try {
			System.out.println("a/b=" + (a / b));
		} catch (ArithmeticException e) {
			System.out.println("ex:" + e);
		//	System.exit(-1);  直接結束
		} finally {
			System.out.println("xxx");
		}
	}

	public static void main(String[] args) {
		ExceptionTest c = new ExceptionTest();
		// c.array();
		c.Exception1(6, 0);
	}

}
