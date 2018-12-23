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
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SavingDevice savingDevice = new SavingDevice("HDD");
		HumanPlayer player1 = new HumanPlayer("James", 45, 12);
		System.out.println(player1.toString());
		
		savingDevice.memory = player1.write();
		System.out.println("---------------------");
		System.out.println("Player One");
		for(String item: savingDevice.memory) {
			System.out.println(item.toString());
		}
		System.out.println("---------------------");
		HumanPlayer newPlayer = new HumanPlayer();
		newPlayer.read(savingDevice.memory);
		System.out.println("Player Two");
		System.out.println(newPlayer.toString());
		
	}

}
