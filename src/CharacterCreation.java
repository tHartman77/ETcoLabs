import javax.swing.JOptionPane;

public class CharacterCreation {
	public static void main(String args[]) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "So, your name is, " + name
				+ " ,right?");

		Object[] optionsclass = { "Warrior", "Mage", "Rogue", "Cleric" };
		Object classman = JOptionPane.showOptionDialog(null, "What class?",
				"Select a Class.", JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, optionsclass,
				optionsclass[0]);
	}
}
