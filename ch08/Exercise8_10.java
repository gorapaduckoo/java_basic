
public class Exercise8_10 {
	public static void main(String[] args) {
		try {
			method1(); // 2 4 출력 후 Exception 던짐
			System.out.println(6);
		} catch(Exception e) {
			System.out.println(7);	// 던져진 예외를 받아서 7 출력
		}
		
		// 2 4 7 출력
	}
	
	static void method1() throws Exception {
		try {
			method2();	
			System.out.println(1);
		} catch(NullPointerException e) {
			System.out.println(2);
			throw e;
		} catch(Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		
		System.out.println(5);
	}
	
	static void method2() {
		throw new NullPointerException();
	}
}
