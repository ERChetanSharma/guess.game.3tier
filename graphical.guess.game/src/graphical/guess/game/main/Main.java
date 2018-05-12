package graphical.guess.game.main;

import java.awt.EventQueue;

import graphical.guess.game.play.Guessgame;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guessgame window = new Guessgame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
