package primary_code;

public class Charactar {
	//char stats
	public int health, strength, magic, defense, speed, luck, skill;
	public Charactar(int h, int str, int m, int d, int sp, int l, int ski) {
		this.health = h;
		this.strength = str;
		this.magic = m;
		this.defense = d;
		this.speed = sp;
		this.luck = l;
		this.skill = ski;
	}
	public Charactar() {
		this.health = 20;
		this.strength = 10;
		this.defense = 7;
		this.magic = 4;
		this.speed = 10;
		this.luck = 10;
		this.skill = 10;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
