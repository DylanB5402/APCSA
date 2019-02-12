
/**
 * Write a description of class Checkers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Checkers {
    
    public static String black = "BLACK";
    public static String white = "White";
    
    public static void main( ) {
        String[][] checkerBoard = new String[8][8];
        //Dylan Barva, Period 6

        for (int i = 0; i < checkerBoard.length; i++) {
            int oddRow = i % 2; 
            boolean isRowOdd = (oddRow == 1) ? true : false;
            for (int j = 0; j < checkerBoard[0].length; j++) {
               int oddColumn = j % 2;
               String color;
               boolean isColumnOdd = (oddColumn == 1) ? true : false;
               if (i <= 2) {
                   checkerBoard[i][j] = getColor(isColumnOdd, isRowOdd, true);
                } else if (i >=5 && i <= 7) {
                    checkerBoard[i][j] = getColor(isColumnOdd, isRowOdd, false);
                } else {
                    checkerBoard[i][j] = null;
                }                
            }
        }
        
        for (int i = 0; i < checkerBoard.length; i++) {
            for (int j = 0; j < checkerBoard[0].length; j++) {
                System.out.print(checkerBoard[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    private static String getColor(boolean isColumnOdd, boolean isRowOdd, boolean isTop) {
        String color = "";
        String desired;
        if (isTop) {
            desired = black;
        } else {
            desired = white;
        }
        if (isRowOdd && !isColumnOdd) {
             color = desired;
        } else if (!isRowOdd && isColumnOdd) {
            color = desired;
        }
        else {
            color = null;
        }
        return color;
        }
}

