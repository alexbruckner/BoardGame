package com.bru.game.board;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 18/11/12
 * Time: 21:16
 */
public enum Colour {
	BLACK("B"),
	WHITE("W"),
	RED("R"),
	GREEN("G");
	private String display;

	private Colour(String display) {
		this.display = display;
	}

	public String getDisplay() {
		return display;
	}
}
