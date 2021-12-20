package lab01;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) throws Exception
	{
		URL imageLocation = new URL("http://horstmann.come/java4everyone/duke.gif");
		JOptionPane.showMessageDialog(null, "Hello There!", "New Greeting",
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));

	}

}
