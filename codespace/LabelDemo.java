import java.awt.Frame;
import java.awt.Label;

public class LabelDemo {
	public static void main(String[] args) {
		Frame f=new Frame("My Frame");
		Label l=new Label("CSMC", Label.CENTER);
		f.add(l);
		f.setSize(300, 300);
		f.setVisible(true);
	}
}