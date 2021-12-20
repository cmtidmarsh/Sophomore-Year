package lab02;
import javax.swing.JFrame;

public class mickeyMouseViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setTitle("Mickey Mouse (Probably CopyRighted)");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mickeyMouseComponent component = new mickeyMouseComponent();
		frame.add(component);
		
		frame.setVisible(true);
		
		

	}

}
