package studio7;

public class Fraction {
	private int num;
	private int dem;
	
	public Fraction(int num, int dem) {
		this.num = num;
		this.dem = dem;
	}
	
	public Fraction multiply(Fraction otherFraction) {
		int newNum = this.num*otherFraction.num;
		int newDem = this.dem*otherFraction.dem;
		return new Fraction(newNum,newDem);
	}
	
	public Fraction divide(Fraction otherFraction) {
		int newNum = this.num*otherFraction.dem;
		int newDem = this.dem*otherFraction.num;
		return new Fraction(newNum,newDem);
	}
	
	public Fraction reciprocal() {
		return new Fraction(this.dem,this.num);
	}
	
	public Fraction addition(Fraction otherFraction) {
		int sumNum = this.num*otherFraction.dem + otherFraction.num*this.dem;
		int sumDem = this.dem * otherFraction.dem;
		return new Fraction(sumNum,sumDem);
	}
	
	public Fraction subtration(Fraction otherFraction) {
		int sumNum = this.num*otherFraction.dem - otherFraction.num*this.dem;
		int sumDem = this.dem * otherFraction.dem;
		return new Fraction(sumNum,sumDem);
	}
	
	public Fraction simplify() {
		int p = this.num;
		int q = this.dem;
		
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		int newNum = this.dem/p;
		int newDem = this.num/q;
		return new Fraction(newNum,newDem);
	}
	
	
	public String toString() {
		return this.num + "/" + this.dem;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(3,6);
		Fraction f2 = new Fraction(1,2);
		
		Fraction f3 = f1.multiply(f2);
		System.out.println(f3);
		
		Fraction f4 = f1.divide(f2);
		System.out.println(f4);
		
		Fraction f5 = f1.reciprocal();
		System.out.println(f5);
		
		Fraction f6 = f1.addition(f2);
		System.out.println(f6);
		
		Fraction f7 = f1.subtration(f2);
		System.out.println(f7);
		
		Fraction f8 = f1.simplify();
		System.out.println(f8);
		
		
	}

}
