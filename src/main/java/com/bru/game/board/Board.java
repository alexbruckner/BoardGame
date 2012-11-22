package com.bru.game.board;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * User: Alex
 * Date: 18/11/12
 * Time: 16:11
 */
public abstract class Board {

	private Lattice lattice;
	private Map<String, Field> lookup;

	private Lattice getLattice() {
		init();
		return lattice;
	}

	private Map<String, Field> getLookup(){
		init();
		return lookup;
	}

	private void init(){
		if (lattice == null) {
			lattice = createLattice();
			lookup = createLookup();
		}
		if(lattice.getLevels().get(0).getFields().length == 0) {
			throw new BoardException("Size of lattice must be at least 1.");
		}
	}

	abstract Lattice createLattice();

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Lattice.Level level : getLattice().getLevels()) {
			for (Field[] column : level.getFields()) {
				for (Field row : column) {
					sb.append("[").append(row.toString()).append("]");
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	protected Map<String, Field> createLookup() {
		Map<String, Field> lookup = new ConcurrentHashMap<String, Field>();
		for (Lattice.Level level : getLattice().getLevels()) {
			for (Field[] column : level.getFields()) {
				for (Field row : column) {
					lookup.put(row.getId(), row);
				}
			}
		}
		return lookup;
	}

	public void place(Piece piece, String fieldId) throws BoardException{
		Field field = getLookup().get(fieldId);
		if (field != null){
			field.place(piece);
		} else {
			throw new BoardException(String.format("Field [%s] is not part of this board.", fieldId));
		}
	}

	protected List<Lattice.Level> getLevels(){
		return getLattice().getLevels();
	}

}
