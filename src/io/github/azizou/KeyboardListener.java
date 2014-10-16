package io.github.azizou;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener{
	
	private boolean keys[] = new boolean[256];

	@Override
	public void keyPressed(KeyEvent event) {
		keys[event.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent event) {
		keys[event.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isKeyPressed(int key){
		return keys[key];
		
	}
	
	public boolean isKeyReleased(int key){
		return !keys[key];
	}

}