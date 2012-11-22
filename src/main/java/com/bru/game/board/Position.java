package com.bru.game.board;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 22/11/12
 * Time: 21:15
 */
public class Position {
	private final Piece piece;
	private final String fieldId;

	public Position(Piece piece, String fieldId) {
		this.piece = piece;
		this.fieldId = fieldId;
	}

	public Piece getPiece() {
		return piece;
	}

	public String getFieldId() {
		return fieldId;
	}
}
