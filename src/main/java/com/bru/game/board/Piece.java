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
	public static final String EMPTY = "---------";     //TODO
	public final Rank rank;

	public Piece(final Colour colour, final Rank rank) {
		this.id = cnt.incrementAndGet();
		this.colour = colour;
		this.rank = rank;
	}

	public String toString() {
		return String.format("<%s[%s]%03d>", colour.getDisplay(), rank.getDisplay(), id);
	}

	public Colour getColour() {
		return colour;
	}

	public Rank getRank() {
		return rank;
	}
}
