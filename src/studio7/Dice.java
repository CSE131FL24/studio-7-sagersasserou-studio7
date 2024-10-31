package studio7;

public class Dice {
	private int numSides;
	

	public Dice(int Sides) {
		this.numSides = Sides;
	}
	
	public int Roll() {
		return (int)(Math.random()*this.numSides) + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice d1 = new Dice(7);
		System.out.println(d1.Roll());
		System.out.println(d1.Roll());
		System.out.println(d1.Roll());
		System.out.println(d1.Roll());
		System.out.println(d1.Roll());
	}

}
