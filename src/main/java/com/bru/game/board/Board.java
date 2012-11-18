package com.bru.game.board;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * User: Alex
 * Date: 18/11/12
 * Time: 16:11
 */
public abstract class Board {

	private Field[][] fields;
	private Map<String, Field> lookup;

	private Field[][] getFields(){
		if (fields == null){
			fields = createBoard();
			lookup = createLookup();
		}
		return fields;
	}

	abstract Field[][] createBoard();

	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (Field[] column : getFields()){
			for (Field row : column) {
				sb.append("[").append(row.toString()).append("]");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	// pieces:

	protected Map<String,Field> createLookup(){
		Map<String, Field> lookup = new ConcurrentHashMap<String, Field>();
		for (Field[] column : getFields()){
			for (Field row : column) {
				lookup.put(row.getId(), row);
			}
		}
		return lookup;
	}

	public void place(String pieceId, String fieldId){
		lookup.get(fieldId).place(new Piece(pieceId));
	}


}
