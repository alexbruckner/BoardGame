package com.bru.game.board;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 18/11/12
 * Time: 16:30
 */
public class SquareBoardTest {

	@Test
	public void test(){
		Board board = new SquareBoard(4);
		board.place(Colour.BLACK, "2-2");
		board.place(Colour.WHITE, "2-3");
		board.place(Colour.BLACK, "1-2");

		System.out.println(board);
		Display display = new Display(board);
		display.print();

	}



}
