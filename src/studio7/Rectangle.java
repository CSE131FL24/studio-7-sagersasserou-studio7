package studio7;

public class Rectangle {
	private double length;
	private double width;
	

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return this.length * this.width;
	}
	
	public double perimeter() {
		return 2 * this.length + 2 * this.width;
	}
	
	public boolean isSquare() {
		if(this.length == this.width) {
			return true;
		}
		return false;
	}
	
	public boolean isBigger(Rectangle otherRectangle) {
		if(this.area() > otherRectangle.area()) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(5,5);
		Rectangle r2 = new Rectangle(7,8);
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
		System.out.println(r1.isSquare());
		System.out.println(r1.isBigger(r2));
		
	}

}
