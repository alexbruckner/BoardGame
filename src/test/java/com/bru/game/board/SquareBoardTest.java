package com.bru.game.board;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 18/11/12
 * Time: 16:30
 */
public class SquareBoardTest {

	@Test
	public void testBoardDisplay() {
		Board board = new SquareBoard(4);
		board.place(Colour.BLACK, "2-2");
		board.place(Colour.WHITE, "2-3");
		board.place(Colour.BLACK, "1-2");

		System.out.println(board);
		Display display = new Display(board);
		System.out.println(display);

		Assert.assertEquals("" +
				"0|[-][-][-][-]\n" +
				"1|[-][-][B][-]\n" +
				"2|[-][-][B][W]\n" +
				"3|[-][-][-][-]\n" +
				"  ------------\n" +
				"   0  1  2  3  \n", display.toString());
	}

	@Test
	public void testZeroSizeLatticeLevel(){
		new SquareBoard(0);
	}

	@Test(expected = BoardException.class)
	public void testZeroSizeLatticeLevelWithCall(){
		System.out.println(new SquareBoard(0));
	}

	@Test
	public void testSizeOneLatticeLevel(){
		Assert.assertEquals("[0-0:------]\n\n", new SquareBoard(1).toString());
	}

	@Test(expected = BoardException.class)
	public void testSizeOneLatticeLevelOutOfBoundsPlay(){
		Board board = new SquareBoard(1);
		board.place(Colour.BLACK, "2-2");
		System.out.println(board);
	}

}
