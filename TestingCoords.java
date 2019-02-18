
public class TestingCoords {
    public static Coord myCoordinate;

	public static void main(String args[]){
        myCoordinate = new Coord(3,4);

        System.out.print("The 'x' coordinate of this two-tuple is: ");
        System.out.println(myCoordinate.x); System.out.println("");

        System.out.print("The 'y' coordinate of this two-tuple is: ");
        System.out.println(myCoordinate.y); System.out.println("");

        System.out.print("The coordinate in tuple format is: ");
        System.out.println(myCoordinate.toString()); System.out.println("");

	}
}
