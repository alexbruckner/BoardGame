package com.bru.game.board;

/**
 * User: Alex
 * Date: 18/11/12
 * Time: 18:29
 */
public class Piece {
	private final String id;
	static final Piece EMPTY = new Piece("----");

	public Piece(String id) {
		this.id = id;
	}

	public String toString() {
		return id;
	}
}
