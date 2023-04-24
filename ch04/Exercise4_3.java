
public class Exercise4_3 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			int tmp = 0;
			for (int j=1; j<=i; j++) {
				tmp+=j;
			}
			sum+=tmp;
		}
		
		System.out.println(sum);
	}
}
