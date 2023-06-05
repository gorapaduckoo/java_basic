class Outer {
	int value = 10;
	
	class Inner {
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);
			// 외부 클래스의 인스턴스 변수는 '외부클래스.this.변수명'으로 접근
		}
	}
}
public class Exercise7_27 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.method1();
	}
}
