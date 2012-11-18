package com.bru.game.board;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 18/11/12
 * Time: 20:33
 */
public class Lattice {

	private List<Level> levels;

	public Lattice(){
		this.levels = new ArrayList<Level>();
	}

	public void addLevel(Field[][] fields) {
		levels.add(new Level(fields));
	}

	static class Level {
		Field[][] fields;

		private Level(Field[][] fields) {
			this.fields = fields;
		}

		public Field[][] getFields() {
			return fields;
		}
	}

	public List<Level> getLevels() {
		return levels;
	}
}
