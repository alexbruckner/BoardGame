package com.bru.game.board;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 22/11/12
 * Time: 20:21
 */
public final class BoardFactory {
	private BoardFactory() {}

	public static Board newBoard(GameType gameType) {

		// make board
		Board board = gameType.getBoard();

		// setup initial pieces
		for (Position position : gameType.getInitialPositions()) {
			board.place(position.getPiece(), position.getFieldId());
		}

		return board;
	}
}
