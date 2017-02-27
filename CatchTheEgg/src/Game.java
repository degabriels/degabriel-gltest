
public class Game {
	
	public int level;//level of difficulty
	public Position position;//position of the basket, 
	//between -5 and 5
	public Animal animals;//the animals currently in the game
	public int nbEggCollected;//number of eggs collected
	public int nbEgg;//total number of eggs in the game
	public int nbShit;//number of shit collected
	
	public Game(){
		level=0;
		posBasket=new Position(0);
		animals=new Animal();
		nbEggCollected=0;
		nbEgg=0;
		nbShit=0;
	}
	
	public boolean looseShit(){
		return (nbShit>=3);
	}
	
	public boolean looseEgg(){
		return ((nbEgg-nbEggCollected)>=3);
	}
	
	public boolean isOver(){
		return (looseShit() || looseEgg());
	}
	
	// adapts the level of difficulty
	public void controlLevel(){
		if (nbEggCollected > 20*level){
			this.level++;
		}
	}
	
	public class Position extends Thread{
		public int posBasket;
		
		public Position(int a){
			posBasket=a;
		}
		
		public void run(){
			if ("right arrow" && 
					posBasket<10){
				posBasket++;
			}
			if ("left arrow" 
					&& posBasket>0){
				posBasket--;
			}
		}
	}
	
	public void play(){
		Display.start();
		Game a = new Game();
		while(!a.isOver()){
			a.controlLevel();
			this.position.run();
			this.animals.run();
			//collectEggs(); function missing
		}
		if (looseEgg()){
			Display.endEgg();
		}
		if (looseShit()){
			Display.endShit();
		}
	}

}
