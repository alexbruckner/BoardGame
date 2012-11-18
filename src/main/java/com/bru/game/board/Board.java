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

	public void place(Colour colour, String fieldId) {
		getLookup().get(fieldId).place(new Piece(colour));
	}

	protected List<Lattice.Level> getLevels(){
		return getLattice().getLevels();
	}

}
