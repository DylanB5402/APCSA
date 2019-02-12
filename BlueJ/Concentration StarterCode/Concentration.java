/**
 * The game of Concentration (also called Memory or Match Match)
 * 
 * Create a gameboard of tiles. Each tile contains a card that has exactly
 * one match on the board. Cards are originally show "face down" on the board.
 * 
 * Player chooses two random cards from the board. The chosen cards
 * are temporarily shown face up. If the cards match, they are removed from board.
 * 
 * Play continues, matching two cards at a time, until all cards have been matched.
 */
public class Concentration extends Board
{
    // create the game board
    private Tile[][] gameboard = makeBoard();
    private String[] cardList = getCards();
    
    /** 
     * The constructor for the game. Creates the 2-dim gameboard
     * by populating it with tiles.
     */
    public Concentration() { 
        generateBoard();
    }
    
    
    public void generateBoard() {
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 3; j++) {
                gameboard[i][j] = new Tile(getRandomCard());
            }
        }
    }
    
    public void display() {
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 3; j++) {
                    System.out.print(gameboard[i][j].getFace() + " ");
                
            }
            System.out.println("");
        }
    }
    
    public String getRandomCard() {
        String card = "";
        int index = 0;
        while (card == "") {
            index = generateIndex();
            card = cardList[index];
        }
        cardList[index] = "";
        return card;
    }
    
    public int generateIndex() {
        return (int)(Math.random() * (cardList.length));
    }
    /**
     * Determine if the board is full of cards that have all been matched,
     * indicating the game is over
     * 
     * Precondition: gameboard is populated with tiles
     * 
     * @return true if all pairs of cards have been matched, false otherwse
     */
    public boolean allTilesMatch() {
        boolean matched = true;
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 3; j++) {
                if (!gameboard[i][j].matched())  {
                    matched = false;
                }
            }
        }
        return matched;
    }

    /**
     * Check for a match between the cards in the two tile locations.
     * For matched cards, remove from the board. For unmatched cares, them face down again.
     * 
     * Precondition: gameboard is populated with tiles,
     * row values (i values) must be in the range of 0 to gameboard.length,
     * column values (j values) must be in the range of 0 to gameboard[0].length
     * 
     * @param row1 the row value of Tile 1
     * @param column1 the column value of Tile 1
     * @param row2 the row value of Tile 2
     * @param column2 the column vlue of Tile 2
     * @return a message indicating whether or not a match occured
     */
    public String checkForMatch(int row1, int column1, int row2, int column2) {
        
        if (gameboard[row1][column1].equals(gameboard[row2][column2])) {
            
            gameboard[row1][column1].foundMatch();
            gameboard[row2][column2].foundMatch();
            return "It's a match";
        } else {
            gameboard[row1][column1].faceUp(false);
            gameboard[row2][column2].faceUp(false);
            return "Not a match";
        }
    }

    /**
     * Set  tile to show its card in the face up state
     * 
     * Precondition: gameboard is populated with tiles,
     * row values (i values) must be in the range of 0 to gameboard.length,
     * column values (j values) must be in the range of 0 to gameboard[0].length
     * 
     * @param row the row value of Tile
     * @param column the column value of Tile
     */
    public void showFaceUp (int row, int column) {
        gameboard[row][column].faceUp(true);
    }

    /**
     * Returns a string representation of the board. A tab is placed between tiles,
     * and a newline is placed at the end of a row
     * 
     * Precondition: gameboard is populated with tiles
     * 
     * @return a string represetation of the board
     */
    public String toString() {
        
        String game = "";
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 3; j++) {
                if (gameboard[i][j].isFaceUp()) {
                    game += gameboard[i][j].getFace() + " ";
                } else {
                    game += gameboard[i][j].getBack() + " ";
                }
            }
            game += "\n";
        }
        return game;
    }
    
    public void win() {
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 3; j++) {
                gameboard[i][j].foundMatch();
            }
        }
    }

}

