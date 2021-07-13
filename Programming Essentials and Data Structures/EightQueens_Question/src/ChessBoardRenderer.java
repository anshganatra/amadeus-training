public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {
		System.out.println(square);
		System.out.println((((square / 8) % 2) == 0) ? (square % 2 != 0) : (square % 2 == 0));
		return (((square / 8) % 2) == 0) ? (square % 2 != 0) : (square % 2 == 0);
	}
}
