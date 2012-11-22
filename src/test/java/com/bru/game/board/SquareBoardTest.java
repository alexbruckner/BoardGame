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
		board.place(new Piece(Colour.BLACK, Rank.KING), "2-2");
		board.place(new Piece(Colour.WHITE, Rank.NONE), "2-3");
		board.place(new Piece(Colour.BLACK, Rank.PAWN), "1-2");

		System.out.println(board);
		Display display = new Display(board);
		System.out.println(display);

		Assert.assertEquals("" +
				"0|[---][---][---][---]\n" +
				"1|[---][---][B-P][---]\n" +
				"2|[---][---][B-K][W-0]\n" +
				"3|[---][---][---][---]\n" +
				"  --------------------\n" +
				"    0    1    2    3    \n", display.toString());
	}

	@Test(expected = BoardException.class)
	public void testZeroSizeLatticeLevel() {
		new SquareBoard(0);
	}

	@Test(expected = BoardException.class)
	public void testZeroSizeLatticeLevelWithCall() {
		System.out.println(new SquareBoard(0));
	}

	@Test
	public void testSizeOneLatticeLevel() {
		Assert.assertEquals("[0-0:---------]\n\n", new SquareBoard(1).toString());
	}

	@Test(expected = BoardException.class)
	public void testSizeOneLatticeLevelOutOfBoundsPlay() {
		Board board = new SquareBoard(1);
		board.place(new Piece(Colour.BLACK, Rank.NONE), "2-2");
	}

	@Test
	public void testGameType(){
		Board board = BoardFactory.newBoard(GameType.CHESS);
		Display display = new Display(board);
		System.out.println(display);
		Assert.assertEquals("" +
				"0|[B-R][B-N][B-B][B-Q][B-K][B-B][B-N][B-R]\n" +
				"1|[B-P][B-P][B-P][B-P][B-P][B-P][B-P][B-P]\n" +
				"2|[---][---][---][---][---][---][---][---]\n" +
				"3|[---][---][---][---][---][---][---][---]\n" +
				"4|[---][---][---][---][---][---][---][---]\n" +
				"5|[---][---][---][---][---][---][---][---]\n" +
				"6|[W-P][W-P][W-P][W-P][W-P][W-P][W-P][W-P]\n" +
				"7|[W-R][W-N][W-B][W-Q][W-K][W-B][W-N][W-R]\n" +
				"  ----------------------------------------\n" +
				"    0    1    2    3    4    5    6    7    \n", display.toString());

	}


	@Test
	//TODO field id mapping for chess board, so that
	//TODO 		board.move("E-2", "E-4") works as well as board.move("6-4", "4-4");
	public void testMove(){
		Board board = BoardFactory.newBoard(GameType.CHESS);
		board.move("6-4", "4-4");
		Display display = new Display(board);
		System.out.println(display);
		Assert.assertEquals("" +
				"0|[B-R][B-N][B-B][B-Q][B-K][B-B][B-N][B-R]\n" +
				"1|[B-P][B-P][B-P][B-P][B-P][B-P][B-P][B-P]\n" +
				"2|[---][---][---][---][---][---][---][---]\n" +
				"3|[---][---][---][---][---][---][---][---]\n" +
				"4|[---][---][---][---][W-P][---][---][---]\n" +
				"5|[---][---][---][---][---][---][---][---]\n" +
				"6|[W-P][W-P][W-P][W-P][---][W-P][W-P][W-P]\n" +
				"7|[W-R][W-N][W-B][W-Q][W-K][W-B][W-N][W-R]\n" +
				"  ----------------------------------------\n" +
				"    0    1    2    3    4    5    6    7    \n", display.toString());

	}



}
