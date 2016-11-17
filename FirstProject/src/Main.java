import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;


public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Test");
		frame.add(new Panel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		frame.setVisible(true);
		
		System.out.println("Hello World!");
		String name = "Jonas";
		System.out.println("My name is " + name);
		System.out.println("I'm carrying the wheel.");
		
		int[] array = new int[]{1, 2, 3, 4};
		reverse(array);
		
		for (int x : array)
			System.out.println(x);
		
		if (name == "Jonas")
		{
			System.out.println("Name confirmed.");
		}
		
		System.out.println(Integer.toString(17, 2));		//accepts base 10 number and conversion base as parameters. returns in base of second parameter. 
		System.out.println(Integer.parseInt("AAA", 16));	// base 10 number
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Alex");
		list.add("Jonas");
		list.add("Ryan");
		list.add("Harry");
		list.add("Ryan");
		
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).equals("Ryan"))
				list.remove("Ryan");
		}
		
		for(String s : list)
		{
			System.out.println(s);
		}
		
		String thing = new String();
		thing += "Boob";
		System.out.println(thing);
		
	}

	public static void reverse (int[] array)
	{
		int temp = 0;
		for (int i=0; i < ((array.length + 1)/2); i++)
		{
			temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
	}
	
	public static class Panel extends JPanel
	{
		
		GridBagConstraints gbc = new GridBagConstraints();
		JLabel label = new JLabel("Current Base: ");
		JButton one = new JButton("one");
		JButton two = new JButton("two");
		JButton three = new JButton("three");
		JButton four = new JButton("four");
		JButton five = new JButton("five");
		JTextField field = new JTextField();
		JSlider slider = new JSlider(2, 16, 10);
		
		Panel()
		{
			setLayout(new BorderLayout());
			field.setPreferredSize(new Dimension(450, 25));
			label.setPreferredSize(new Dimension(125, 25));
			slider.setPreferredSize(new Dimension(325, 85));
			slider.setMajorTickSpacing(1);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			field.setEditable(true);
			JPanel panel2 = new JPanel();
			FlowLayout panel2layout = new FlowLayout();
			panel2layout.setHgap(0);
			panel2layout.setVgap(10);
			panel2.setLayout(panel2layout);
			
			JPanel panel3 = new JPanel();
			BoxLayout box = new BoxLayout(panel3, BoxLayout.Y_AXIS);
			Box theBox = Box.createVerticalBox();
			panel3.setLayout(box);
			panel3.add(Box.createRigidArea(new Dimension(0,50)));
			
			panel2.add(field);
			panel2.add(label);
			panel2.add(slider);
			
			/*
			theBox.add(Box.createVerticalStrut(50));
			theBox.add(one);
			theBox.add(Box.createVerticalStrut(5));
			theBox.add(two);
			theBox.add(Box.createVerticalStrut(5));
			theBox.add(three);
			theBox.add(Box.createVerticalStrut(5));
			theBox.add(four);
			theBox.add(Box.createVerticalStrut(5));
			theBox.add(five);
			*/
			
			panel3.add(one);
			panel3.add(two);
			panel3.add(three);
			
			add(panel2, BorderLayout.NORTH);
			add(panel3, BorderLayout.EAST);
			//add(slider, BorderLayout.WEST);
			
		}
	}
}




















