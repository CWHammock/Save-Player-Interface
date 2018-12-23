/**
 * 
 */
package npcs;

import java.util.List;

/**
 * @author charles
 *
 */
public interface ISaveable {
	List write();
	void read(List savedValues);
}
