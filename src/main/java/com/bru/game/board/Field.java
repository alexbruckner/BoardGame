package com.bru.game.board;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * User: Alex
 * Date: 18/11/12
 * Time: 16:11
 */
public class Field {

	private final String id;
	private final Set<Field> neighbours;
	private Piece piece;

	public Field(String id) {
		this.id = id;
		this.neighbours = new CopyOnWriteArraySet<Field>();
	}

	public String getId() {
		return id;
	}

	public Set<String> getNeighbourIds() {
		Set<String> neighbourIds = new HashSet<String>();
		for (Field neighbour : neighbours){
			neighbourIds.add(neighbour.id);
		}
		return neighbourIds;
	}

	public void addNeightbour(Field field){
		neighbours.add(field);
		field.neighbours.add(this);
	}

	public String toString(){
		return String.format("%s:%s", id, piece == null ? Piece.EMPTY :piece);
	}

	@Override
	public boolean equals(Object o) {
		return this == o
					|| !(o == null || getClass() != o.getClass())
					&& id.equals(((Field) o).id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	public void place(Piece piece) {
	  	this.piece = piece;
	}
}
