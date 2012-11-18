package com.bru.game.board;

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
		if (lattice == null) {
			lattice = createLattice();
			lookup = createLookup();
		}
		return lattice;
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
		lookup.get(fieldId).place(new Piece(colour));
	}

}
