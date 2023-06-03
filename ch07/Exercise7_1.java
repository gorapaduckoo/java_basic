
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for (int i=0; i<CARD_NUM; i++) {
			boolean isKwang = false;
			if(i+1==1 || i+1==3 || i+1==8) {
				isKwang = true;
			}
			
			cards[i] = new SutdaCard(i%10+1, isKwang);
		}
	}
	
	void shuffle() {
		for (int i=0; i<cards.length; i++) {
			int j = (int)(Math.random()*cards.length);
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		if(index<0 || index>=cards.length) return null;
		return cards[index];
	}
	
	SutdaCard pick() {
		int index = (int)(Math.random()*cards.length);
		return cards[index];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}

public class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for (int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
	}
}
