class Outer {
	static class Inner {
		int iv = 200;
	}
}
public class Exercise7_26 {
	public static void main(String[] args) {
		Outer.Inner i = new Outer.Inner();
		System.out.println(i.iv);
		
		// 내부 스태틱 클래스는 외부 클래스의 인스턴스 생성 없이도 생성 가능
	}
}
