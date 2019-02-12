
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class Main
     */
    public static void Main()
    {
        String [][] values = new String[10][25];
        for (int i = 0; i < values.length - 1; i++ ) {
            for (int j = 0; j < values[0].length - 1; j++) {
                values[i][j] = "f";
            }
        }
        System.out.println(values[9][23]);
    }
}
    

