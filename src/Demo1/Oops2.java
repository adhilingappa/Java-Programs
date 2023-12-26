package Demo1;

public class Oops2 extends Oops1 {
	private double bal;
	String name;
	int accno;

	Oops2() {
	}

	Oops2(String name, int accno, double sal) {
		this.name = name;
		this.accno = accno;
		this.bal = bal;
	}

	public void deposit(double amt) {
		this.bal = bal + amt;
		System.out.println("succesfully deposited");

	}

	public void withdrawl(double amt) {
		if (amt <= bal) {
			bal = bal - amt;
			System.out.println("succesfully withdrawl");
		} else {
			System.out.println("insuffient balance");
		}

	}

	public double check_bal() {
		return bal;
	}

}
