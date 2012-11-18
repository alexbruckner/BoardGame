package com.bru.game.board;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 18/11/12
 * Time: 21:24
 */
public class Display {
	private final Board board;

	public Display(Board board) {
		this.board = board;
	}

	public String toString(){
		return board.toString();
	}

	public void print(){
		StringBuilder sb = new StringBuilder();
		int rows = 0;
		int cols = 0;
		for (Lattice.Level level : board.getLevels()) {
			for (Field[] column : level.getFields()) {
				sb.append(rows++).append("|");
				cols = column.length;
				for (Field row : column) {
					String colour = row.getPiece() == null ? "-" : row.getPiece().getColour().getDisplay();
					sb.append("[").append(colour).append("]");
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		System.out.println(String.format("  %s", Utils.repeat("---", cols, "")));
		System.out.println(String.format("   %s", Utils.range(0, cols - 1, "  ")));
	}
}
