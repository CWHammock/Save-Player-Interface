/**
 * 
 */
package npcs;

import java.util.List;
import java.util.ArrayList;

/**
 * @author charles
 *
 */
public class HumanPlayer implements ISaveable{
	private String name;
	private int health;
	private int strength;

	public HumanPlayer() {
		
	}
	
	
	public HumanPlayer(String name, int health, int strength) {
		this.name = name;
		this.health = health;
		this.strength = strength;
	}
	
	public String toString() {
		return "Name: " + this.name +
				" Health: " + this.health +
				" Strength: " + this.strength;
				
	}

	@Override
	public List<String> write() {
		List<String> saveInfo = new ArrayList<>();
		saveInfo.add(this.name);
		saveInfo.add(Integer.toString(this.health));
		saveInfo.add(Integer.toString(this.strength));
		return saveInfo;
		
	}

	@Override
	public void read(List savedValues) {
		try {
			this.name = savedValues.get(0).toString();
			this.health = Integer.parseInt((String) savedValues.get(1));
			this.strength = Integer.parseInt((String)savedValues.get(2));
			System.out.println(this.name + " player loaded...");
		}catch(Exception e) {
			System.out.println(e);
		}

	}
}
