
//characters represent the fighting subjects
import javax.swing.*;
public class Character {

	
	double
	
	//this is the current health of the character(how many hits left)
	currHealth,
	//this is the current attack strength of the character(attack strength after being (de)buffed)
	currAttack,
	currDefense,
	currSpeed,
	currAccuracy;
	
	public int
	health,
	attack,
	defense,
	speed,
	accuracy;
	
	String name;
	
	ImageIcon playerModel;
	
	public move[] movesArray = new move[4];
	
	public Character(int h, int a, int d, int s,String n, int ac, ImageIcon i)
	{
		health = h;
		currHealth = health;
		attack = a;
		currAttack = attack;
		defense = d;
		currDefense = defense;
		speed = s;
		currSpeed = speed;
		accuracy = ac;
		currAccuracy = accuracy;
		name = n;
		playerModel = i;
	}
	
	public String getName()
	{
		return name;
	}

	public double getHealth()
	{
		return currHealth;
	}
	
	public double getDefense()
	{
		return currDefense;
	}

	public double getAccuracy()	
	{
		return currAccuracy;
	}

	public double getSpeed()
	{
		return currSpeed;
	}

	public void fullHeal()
	{
	currHealth = health;
	currDefense = defense;
	
	}
	
	public boolean isFaint()
	{
		if(currHealth <= 0)
		{
			return true;
		}
		else return false;
	}
	
	public ImageIcon getIcon()	
	{
		return playerModel;
	}
	
	public void addMove(move m)
	{
		if(movesArray[0] == null)
		{
			movesArray[0] = m;
		}
		else if(movesArray[1] == null)
		{
			movesArray[1] = m;
		}
		else if(movesArray[2]== null)
		{
			movesArray[2] = m;
		}
		else if(movesArray[3] == null)
		{
			movesArray[3] = m;
		}
	}
	
	final int
	HEALTH = 0,
	ATTACK = 1,
	DEFENSE = 2,
	SPEED = 3,
	ACCURACY = 4;
	
	public void healthDown(double decrement)
	{
			currHealth = currHealth - decrement;
	}
	

	//public double
	
	//this is the current health of the character(how many hits left)
	//currHealth,
	
	//this is the current attack strength of the character(attack strength after being (de)buffed)
	//currAttack,
	
		//currDefense,
		
		//currSpeed,
		
		//currAccuracy;
	public String toString()
	{
		return ("Name :" + name + "\n"
				+ "Health : " + currHealth + "\n"
				+ "Attack : " + currAttack + "\n"
				+ "Defense : " + currDefense + "\n"
				+ "Speed : " + currSpeed + "\n" 
				+ "Accuracy : " + currAccuracy);
	}
	
	
}
