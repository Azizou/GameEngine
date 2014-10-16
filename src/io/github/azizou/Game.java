package io.github.azizou;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Game {
	private final JFrame window = new JFrame();
	private final ScreenFactory screenFactory;
	private final GameThread gameThread;
	private final KeyboardListener keyboardListener;
	private final MousepadListener mouseListener;
	
	
	public Game(int windoX, int windowY, String title) {
		window.setSize(windoX, windowY);
		window.setTitle(title);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setFocusable(true);
		window.setResizable(false);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		this.screenFactory = new ScreenFactory(this);
		
		gameThread = new GameThread(this);
		window.add(gameThread);
		keyboardListener = new KeyboardListener();
		window.addKeyListener(keyboardListener);
		
		mouseListener = new MousepadListener();
		window.addMouseListener(mouseListener);
		
		new Thread(gameThread).start();
}
	
	public KeyListener getKeyboardListerner(){
		
		return keyboardListener;
	}
	public MouseListener getMouseListener(){
		
		return mouseListener;
	}

public JFrame getWindow(){
	
	return window;
}

public ScreenFactory getScreenFactory(){
	
	return screenFactory;
}
}
