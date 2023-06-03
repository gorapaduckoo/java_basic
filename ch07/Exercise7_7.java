class Parent {
	int x = 100;
	
	Parent() {
		this(200);	// 3
	}
	
	Parent(int x) {
		this.x = x;	// 4
	}
	
	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;
	
	Child() {
		this(1000);	// 1
	}
	
	Child(int x) {
		this.x = x;	// 2
	}
}

public class Exercise7_7 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x="+c.getX()); // x=200
		// 조상 클래스에 정의된 메서드는 조상 클래스의 인스턴스 변수를 참조함
	}
}
