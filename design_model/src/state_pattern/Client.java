package state_pattern;

public class Client {
	public static void main(String args[]) {

		GameContext gameContext=new GameContext("jack");
		gameContext.play(50, "win");
		System.out.println(   gameContext.getState());
		gameContext.play(5000, "win");
		gameContext.changeCards();
		System.out.println(   gameContext.getState());
	 gameContext.play(5000, "lose");
		System.out.println(   gameContext.getState());
	
	}

}
