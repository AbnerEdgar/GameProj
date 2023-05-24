public class Racket extends Item{
	
	private int tension;
	
	Racket(){
		super();
		this.tension = 0;
	}
	
	public Racket(String name, float offense, float defense, int weight, float price, int tension) {
		super(name, offense, defense, weight, price);
		this.tension = tension;
	}

	public int getTension() {
		return tension;
	}
}
