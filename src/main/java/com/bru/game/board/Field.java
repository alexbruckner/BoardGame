package com.bru.game.board;

import java.util.Collections;
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

	public Field(String id) {
		this.id = id;
		this.neighbours = new CopyOnWriteArraySet<Field>();
	}

	public String getId() {
		return id;
	}

	public Set<Field> getNeighbours() {
		return Collections.unmodifiableSet(neighbours);
	}

	public void addNeightbour(Field field){
		neighbours.add(field);
	}

	public String toString(){
		return String.format("[%s]", id);
	}
}
