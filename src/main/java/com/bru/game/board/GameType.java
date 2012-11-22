package com.bru.game.board;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 22/11/12
 * Time: 21:16
 */
public enum GameType {
	CHESS(new SquareBoard(8), createChessPositions()) //TODO
//	, GO, CONNECT4, SHOGI, XIANGXI;
	;

	private static Position[] createChessPositions() {
		Position[] positions = new Position[32];
		positions[0] = new Position(new Piece(Colour.WHITE, Rank.PAWN), "6-0");
		positions[1] = new Position(new Piece(Colour.WHITE, Rank.PAWN), "6-1");
		positions[2] = new Position(new Piece(Colour.WHITE, Rank.PAWN), "6-2");
		positions[3] = new Position(new Piece(Colour.WHITE, Rank.PAWN), "6-3");
		positions[4] = new Position(new Piece(Colour.WHITE, Rank.PAWN), "6-4");
		positions[5] = new Position(new Piece(Colour.WHITE, Rank.PAWN), "6-5");
		positions[6] = new Position(new Piece(Colour.WHITE, Rank.PAWN), "6-6");
		positions[7] = new Position(new Piece(Colour.WHITE, Rank.PAWN), "6-7");

		positions[8] = new Position(new Piece(Colour.WHITE, Rank.ROOK), "7-0");
		positions[9] = new Position(new Piece(Colour.WHITE, Rank.KNIGHT), "7-1");
		positions[10] = new Position(new Piece(Colour.WHITE, Rank.BISHOP), "7-2");
		positions[11] = new Position(new Piece(Colour.WHITE, Rank.QUEEN), "7-3");
		positions[12] = new Position(new Piece(Colour.WHITE, Rank.KING), "7-4");
		positions[13] = new Position(new Piece(Colour.WHITE, Rank.BISHOP), "7-5");
		positions[14] = new Position(new Piece(Colour.WHITE, Rank.KNIGHT), "7-6");
		positions[15] = new Position(new Piece(Colour.WHITE, Rank.ROOK), "7-7");

		positions[16] = new Position(new Piece(Colour.BLACK, Rank.PAWN), "1-0");
		positions[17] = new Position(new Piece(Colour.BLACK, Rank.PAWN), "1-1");
		positions[18] = new Position(new Piece(Colour.BLACK, Rank.PAWN), "1-2");
		positions[19] = new Position(new Piece(Colour.BLACK, Rank.PAWN), "1-3");
		positions[20] = new Position(new Piece(Colour.BLACK, Rank.PAWN), "1-4");
		positions[21] = new Position(new Piece(Colour.BLACK, Rank.PAWN), "1-5");
		positions[22] = new Position(new Piece(Colour.BLACK, Rank.PAWN), "1-6");
		positions[23] = new Position(new Piece(Colour.BLACK, Rank.PAWN), "1-7");

		positions[24] = new Position(new Piece(Colour.BLACK, Rank.ROOK), "0-0");
		positions[25] = new Position(new Piece(Colour.BLACK, Rank.KNIGHT), "0-1");
		positions[26] = new Position(new Piece(Colour.BLACK, Rank.BISHOP), "0-2");
		positions[27] = new Position(new Piece(Colour.BLACK, Rank.QUEEN), "0-3");
		positions[28] = new Position(new Piece(Colour.BLACK, Rank.KING), "0-4");
		positions[29] = new Position(new Piece(Colour.BLACK, Rank.BISHOP), "0-5");
		positions[30] = new Position(new Piece(Colour.BLACK, Rank.KNIGHT), "0-6");
		positions[31] = new Position(new Piece(Colour.BLACK, Rank.ROOK), "0-7");

		return positions;
	}

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
