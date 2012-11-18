package com.bru.game.board;

/**
 * User: Alex
 * Date: 18/11/12
 * Time: 16:18
 */
public class SquareBoard extends Board {
	private final int width;

	public SquareBoard(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	@Override
	Field[][] createBoard() {
		Field[][] fields = new Field[width][width];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < width; j++) {
 				fields[i][j] = new Field(String.format("%s-%s", i, j));
				setNeighbours(fields, i, j);
			}
		}
		return fields;
	}

	private void setNeighbours(Field[][] fields, int i, int j) {
		if (i > 0){
			fields[i-1][j].addNeightbour(fields[i][j]);
		}
		if (j > 0){
			fields[i][j-1].addNeightbour(fields[i][j]);
		}
	}
}
