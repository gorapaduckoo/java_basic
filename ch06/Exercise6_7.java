class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		int width = x-x1;
		int height = y-y1;
		return Math.sqrt(width*width + height*height);
	}
}
public class Exercise6_7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		// p와  (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));
	}
}
