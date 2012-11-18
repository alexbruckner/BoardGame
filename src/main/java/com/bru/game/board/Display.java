package com.bru.game.board;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 18/11/12
 * Time: 16:45
 */
public class Display {

	private final Board board;

	public Display(Board board) {
		this.board = board;
	}

	public Board getBoard() {
		return board;
	}

	public String toString(){
		return board.toString();
	}
}
