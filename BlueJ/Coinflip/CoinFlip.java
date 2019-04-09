
/**
 * Write a description of class CoinFlip here.
 *
 * @author Barva, Dylan
 * @version 
 */
public class CoinFlip
{
    public static String flip() {
        int rand = getRandomInt(0, 2);
        if (rand < 2) {
            return "heads";
        } else {
            return "tails";
        }
            
    }
    
    public static int getRandomInt(int Min, int Max) {
        return Min + (int)(Math.random() * ((Max - Min) + 1));
    }
    
    public static void Main() {
        for (int i = 0; i < 10; i++) {
            System.out.println(flip());
        }
    }
}
