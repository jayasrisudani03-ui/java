import java.awt.Frame;

public class MyFrame extends Frame {
	MyFrame(String str)
	{
		super(str);
	}

	public static void main(String[] args) 
	{
		MyFrame f=new MyFrame("My Second Frame");
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
