package com.bru.game.board;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 22/11/12
 * Time: 21:16
 */
public enum GameType {
	CHESS(new SquareBoard(8), null) //TODO
//	, GO, CONNECT4, SHOGI, XIANGXI;
	;

	private Board board;
	private Position[] initialPositions;

	private GameType(Board board, Position[] initialPositions) {
		this.board = board;
		this.initialPositions = initialPositions;
	}

	public Board getBoard() {
		return board;
	}

	public Position[] getInitialPositions() {
		return initialPositions;
	}
}
