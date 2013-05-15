package agh.mownit;

import java.awt.EventQueue;

import agh.mownit.StartFrame;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					StartFrame startFrame = new StartFrame();
					startFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
