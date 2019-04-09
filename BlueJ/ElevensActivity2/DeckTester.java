/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck deck1 = new Deck(new String[]{"1", "2", "3"}, new String[]{"clubs", "hearts", "spades"}, new int[]{1, 2, 3});
		System.out.println(deck1);
		deck1.shuffle();
		System.out.println(deck1);
	}
}
