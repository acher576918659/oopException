package tw.aaa.myproject.OOP.Exception;

class MyOwnException extends Exception {

	private static final long serialVersionUID = 1L;
	private String server = "Deep Blue";
	private int port = 80;
	private String errMsg = "System Error";

	public MyOwnException(String server, int port, String errMsg) {
		this.server = server;
		this.port = port;
		this.errMsg = errMsg;
	}

	public void showInfo() {
		System.out.println("Server:" + server);
		System.out.println("Port:" + port);
		System.out.println("Error Message:" + errMsg);
	}
}

public class CallTestMyOwnExceptionEx1 {

	public static void main(String[] args) {
        int code = 006;
        if(code%2==0){
        	try {
				throw new MyOwnException("Blade", 12345, "Unauthorized Access Intruder");
			} catch (MyOwnException e) {
				//e.printStackTrace();
				e.showInfo();
			}
        }else{
        	System.out.println("Welcome, Amigo.");
        }
	}

}
