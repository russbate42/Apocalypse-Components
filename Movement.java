
public class Movement{

    private Piece currentPiece;
    private Piece referencePiece;
    private boolean isLegalMove = false;
    private String pieceType;
    private String pieceColor;


    /** Sets the current piece 
    **/
    public void setCurrentPiece(Piece inputPiece){
        currentPiece = inputPiece;
    }


    /** Grabs current piece
    **/
    public Piece getCurrentPiece(){
    	Piece copyCurrentPiece = currentPiece;
    	return copyCurrentPiece;
    }


    /** Sets the reference piece
    **/
    public void setReferencePiece(Piece inputPiece){
    	refPiece = inputPiece;
    }

    
    /** Grabs current reference piece
    **/
    public Piece getReferencePiece(){
    	Piece copyReferencePiece = referencePiece;
    	return copyReferencePiece;
    }


    /** Simple boolean determining if the move is allowed for the rules
    @ params t.b.a.
    @ returns <isLegalMove> boolean if the move is legal
    **/
    public boolean legalMove(Coord move, ArrayList<Coord> totalMoves){
    	boolean isLegalMove = false;

        //use genmoves to populate a list, then check it to see if the move
    	// is in it;
    	if (totalMoves.size() > 0)
    	    for (Coord possibleMove : totalMoves)
    	        if (possibleMove == move){
    	        	isLegalMove = true;
    	        }
        
        return isLegalMove;
    } 


 //    /** Gets the color of the reference piece. This is used to determine
 //    allowed movement.
 //    @ params <pieceColor> color of piece
 //    **/ 
	// private String getColor(){
 //        return " ";
	// }


 //     Gets the color of the reference piece. This is used to determine
 //    allowed movement.
 //    @ params <pieceColor> color of piece
     
	// private String getPieceType(Piece refPiece){
 //        return " ";
	// }


    /* Populates a list of tuples representing the allowed moves
    @ params <pieceColor>: Needs the color to determine movement
    <pieceType>: Needs the piece type (knight, pawn) to determine movement
    @ returns <moveList>: The populated list
    */
	private ArrayList<Coord> genMoves(Piece somePiece){
		String pieceType = somePiece.getType();
		String pieceColor = somePiece.getColor();
		Coord piecePosition = somePiece.getPosition();
        ArrayList<Coord> moveList = new ArrayList<Coord>;

		// logical fuckery of populating list of tuples

        // TWO CASES FOR PIECES

        // KNIGHT
		if (piecetype == "knight"){
			// Generate moves for knights
            if (pieceColor == "white" || pieceColor = "black"){

            }

            else{
            	System.out.print("Invalid piece color found in type <knight>.")
            }
		}

        // PAWN
        else if (pieceType == "pawn"){
        	// FURTHER BROKEN UP INTO TWO CASES FOR PAWN
        	// WHITE PAWN
        	if (pieceColor == "white"){
        		// add tuple (1,0)
                // check board for diagonal moves (+1,-1), (+1,+1)
        	}
        	// BLACK PAWN
        	else if (pieceColor == "black"){
                // add tuple (-1,0)
                // check board for diagonal moves (-1,-1), (-1,+1)
        	}

        	else {
        		System.out.println("Invalid piece color found in type <pawn>");
        	}

        else {
        	System.out.println("Invalid piece type found in genMoves.")
        }
        }

        if (moveList.size() > 0){
            for (Coord location : moveList){
                // simple test to see if the x and y coordinates are within
                // the bounds of (0,4) and (0,4) respectively
            }
        }

		return moveList;
	}



	public Piece checkBoard(Coord location){
        int xLoc = location.x;
        int yLoc = location.y;
        Piece refPiece;

        if (withinBoard(location) == true){
            refPiece = Board[yLoc][xLoc];
        }

        else {
        	refPiece = null;
        }
        return refPiece;
	}


    public boolean withinBoard(Coord location){
        boolean inBounds;

        if (location.x >= 0 || location.x <=4){
        	withinX = true;
        	if (location.y >= 0 || location.y <=4){
        		inBounds = true;
        	}
        	else {
                inBounds = false;
        	}
        }

        else {
        	inBounds = false;
        }

        return inBounds;
    }


    /* Take in the list of coordinates and eliminate the ones which move
    the piece off the board
    @ params <moveList>: the list of tuples of possible moves
    @ returns <moveList>: the list with values of movement off
    of the board deleted
    @ see genMoves()
    */
    public void boundedMove(){
    
    }
    
    /* This is the "final word" mutator method which ultimately moves
    the current piece. Must have legalMove = true for movement to take place
    @params none.
    @see legalMove
    */
	public void movePiece(){
        
        if (isLegalMove == true){
        // do stuff in here moving the ref of board to where the move is
        }

        else {
        	System.out.print("Not legal move.")
        }
	}


    /* Checks if the pawn has reached the end of the board such that 
    the test is to see if the pawn will upgrade
    @ params <currentPiece>: the piece in question, will pull coordinates
    from the piece
    @ returns none
    */
    public void upgrade(){
    	// Conditional test to see if pawn needs to be upgraded
    }
}
