package io.github.azizou;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MousepadListener implements MouseListener{

	private int mouseX;
	private int mouseY;
	private boolean clicked;
	@Override
	public void mouseClicked(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		clicked = true;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		mouseClicked(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		clicked = false;
		
	}
	
	public boolean isMousePressed(){
		return clicked;
	}
	
	public int getX(){
		return mouseX;
	}
	public int getY(){
		return mouseY;
	}

}
