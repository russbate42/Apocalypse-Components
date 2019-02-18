
public class PieceTest{

	public static void main(String args[]){

    Coord aBoardPosition = new Coord(0,1);
    Piece myPiece = new Piece("white", "pawn", 1, aBoardPosition);

    String myPieceColor = myPiece.color;
    String myPieceType = myPiece.type;
    String myPieceNumber = Integer.toString(myPiece.number);
    String myPieceLocation = myPiece.position.toString();

    System.out.println("Color: "+myPieceColor);
    System.out.println("Type: "+myPieceType);
    System.out.println("Number: "+myPieceNumber);
    System.out.println("Board position: "+myPieceLocation);

    System.out.println("This piece is a: "+myPiece.toString());
    System.out.println("This will be displayed on the board as: "+myPiece.display);
    System.out.println(""); System.out.println("");
    
    Coord aBoardPosition2 = new Coord(4,3);
    Piece anotherPiece = new Piece("black", "knight", 2, aBoardPosition2);
    System.out.println("This piece is a: "+anotherPiece.toString());
    String longString = "This will be displayed on the board as: "; 
    System.out.println(longString+anotherPiece.display);
    System.out.println("");


	}
}
