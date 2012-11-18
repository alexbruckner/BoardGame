package com.bru.game.board;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 18/11/12
 * Time: 21:51
 */
public final class Utils {
	private Utils() {
	}

	public static String range(int from, int to, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = from; i <= to; i++) {
			sb.append(i).append(separator);
		}
		return sb.toString();
	}

	public static String repeat(String str, int count, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(str).append(separator);
		}
		return sb.toString();
	}

}
