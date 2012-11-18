package com.bru.game.board;

/**
 * User: Alex
 * Date: 18/11/12
 * Time: 16:11
 */
public abstract class Board {

	private Field[][] fields;

	private Field[][] getFields(){
		if (fields == null){
			fields = createBoard();
		}
		return fields;
	}

	// return the ROOT Field of all linked Fields that make up the board
	abstract Field[][] createBoard();

	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (Field[] column : getFields()){
			for (Field row : column) {
				sb.append(row.toString());
			}
			sb.append("\n");
		}
		return sb.toString();
	}


}
