
public class Exercise6_6 {
	static double getDistance(int x, int y, int x1, int y1) {
		int width = x-x1;
		int height = y-y1;
		return Math.sqrt(width*width + height*height);
	}
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}
}
