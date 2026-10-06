import java.awt.*;

public class ButtonDemo1 {
	public static void main(String[] args) {
		Frame f=new Frame("Button Demo");
		Button b=new Button("Click Me");
		b.setBounds(100, 100, 100, 40);
		f.add(b);
		f.setSize(300, 250);
		f.setVisible(true);
	}
}