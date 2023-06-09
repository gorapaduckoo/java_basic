import java.util.Scanner;

public class Exercise5_12 {
	public static void main(String[] args) {
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		for (int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
			String answer = scanner.nextLine();
			
			if(answer.equals(words[i][1])) {
				System.out.println("정답입니다.\n");
				score++;
				continue;
			}
			System.out.println("틀렸습니다. 정답은 " + words[i][1] + "입니다.\n");
			
		}
		
		System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.", words.length, score);
	}
}
