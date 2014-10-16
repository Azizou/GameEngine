package io.github.azizou;

public class ScreenFactory {
	
	@SuppressWarnings("unused")
	private final Game game;
	private Screen screen;
	
	public ScreenFactory(Game game) {
		this.game = game;
	}
	
	public void showScreen(Screen screen){
		this.screen = screen;
	}
	
	
	public Screen getCurrentScreen(){
		
		return screen;
	}
}

