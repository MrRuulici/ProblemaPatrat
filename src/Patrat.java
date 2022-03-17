
public class Patrat {

	private int l, a;

	public Patrat() {
		this.l = 10;
	}
	
	public Patrat(int l) {
		this.l = l;
	}

	public int Aria() {
		return this.a = this.l * this.l;
	}

	@Override
	public String toString() {
		return "Patratul cu latura " + l + " are aria " + Aria();
	}
	
}
