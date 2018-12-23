/**
 * 
 */
package npcs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author charl
 *
 */
public class SavingDevice {
	String name;
	List<String> memory;
	
	public SavingDevice(String name) {
		this.name = name;
		memory = new ArrayList<>();
	}
	
	public String getName() {
		return this.name;
	}
}
