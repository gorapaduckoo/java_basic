class Outer {
	class Inner {
		int iv=100;
	}
}
public class Exercise7_25 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		System.out.println(i.iv);
		
		// 내부 인스턴스 클래스를 생성하기 위해서는 먼저 외부 클래스의 인스턴스를 생성해주어야 함
	}
}
