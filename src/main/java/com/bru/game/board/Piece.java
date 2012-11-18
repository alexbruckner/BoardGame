package com.bru.game.board;

import java.util.concurrent.atomic.AtomicLong;

/**
 * User: Alex
 * Date: 18/11/12
 * Time: 18:29
 */
public class Piece {

	private static final AtomicLong cnt = new AtomicLong();
	private final long id;
	private final Colour colour;
	public static final String EMPTY = "------";     //TODO

	public Piece(Colour colour) {
		this.id = cnt.incrementAndGet();
		this.colour = colour;
	}

	public String toString() {
		return String.format("<%s%03d>", colour.getDisplay(), id);
	}

	public Colour getColour() {
		return colour;
	}
}
