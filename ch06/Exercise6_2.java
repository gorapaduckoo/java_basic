
public class Exercise6_2 {
	static class SutdaCard {
		int num;
		boolean isKwang;
		public SutdaCard() {
			this.num = 1;
			this.isKwang = true;
		}
		public SutdaCard(int num, boolean isKwang) {
			this.num = num;
			this.isKwang = isKwang;
		}
		
		public String info() {
			if(isKwang) return this.num+"K";
			else return this.num+"";
		}
	}
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}
