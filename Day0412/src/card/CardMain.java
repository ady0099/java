package card;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card();
		c.kind = "Heart";
		c.number=7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		c.width = 50;
		c.height= 80;
		
		
	}

}

class Card
{
		static int width = 100;
		static int height = 250;
		String kind;
		int number;
}