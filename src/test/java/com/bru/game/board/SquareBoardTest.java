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
		System.out.println(board);
		board.place("<1B>", "2-2");
		System.out.println(board);
	}



}
