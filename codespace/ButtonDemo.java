import java.awt.*;
public class ButtonDemo extends Panel
{
	
	//constructor Builds the entire visible GUI
	public ButtonDemo()
	{
	Button b1=new Button("RED!!"); //Creates a button with the specified label.
	Button b2=new Button("GREEN!!");
	Button b3=new Button("White!!");
	b3.setLabel("WHITE!!"); //Sets this button's label.
	b1.setFont(new Font("SansSerif",Font.PLAIN,18));
	add(b1);
	add(b2);
	add(b3);
	}

	public static void main(String[] args)
	{
	ButtonDemo bobj=new ButtonDemo();
	Frame f=new Frame("Buttons");
	f.add(bobj);
	f.pack(); //frames appear on screen
	f.setVisible(true); //set the visibility of your buttons so that they would appear on screen
	
	}
}