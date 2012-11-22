package com.bru.game.board;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 18/11/12
 * Time: 21:16
 */
public enum Rank {
	PAWN("P"),
	KING("K"),
	QUEEN("K"),
	NONE("0");
	private String display;

	private Rank(String display) {
		this.display = display;
	}

	public String getDisplay() {
		return display;
	}
}
