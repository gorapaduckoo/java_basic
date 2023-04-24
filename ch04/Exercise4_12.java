
public class Exercise4_12 {
	public static void main(String[] args) {
		for (int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				for (int k=(i*3)-1; k<=(i*3)+1; k++) {
					if(k>9) break;
					System.out.print(k+"*"+j+"="+(k*j)+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
