code 1 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyListener implements ActionListener
{
	private static int count = 0;
	ImageIcon X = new ImageIcon("X.jpg");
	ImageIcon O = new ImageIcon("O.png");

      public void actionPerformed(ActionEvent ae)
      {
		count++;
		JButton b = (JButton)ae.getSource();
		if(count %2 == 1)
		b.setIcon(X);
		else 
		b.setIcon(O);
      }
}


class MyApp
{
    static public void main(String[] rk)
    {
	JFrame fr = new JFrame("Ravi Kant Sahu");
	fr.setSize(900, 900);
	fr.setLocationRelativeTo(null);	//Frame to appear at the CENTER of teh Screen
	fr.setTitle("My Project");
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	ImageIcon ic1 = new ImageIcon("tic-tac-toe.png");
	fr.setIconImage(ic1.getImage());

	GridLayout gl = new GridLayout(3, 3);
	fr.setLayout(gl);							//Apply the Layout

	Font f1 = new Font(Font.SERIF, 3, 80);

	MyListener ml = new MyListener();		//Listener class Object

	for(int i=1; i<10; i++)
	{
		JButton b = new JButton();
		fr.add(b);
		b.addActionListener(ml);			//Event Listener Registration 
        }

	fr.setResizable(false);
	fr.setVisible(true);		//To make the Frame Visible
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------

Code 2
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ExpenseTracker
{
	static JFrame jf = new JFrame("Expense Tracker");
	static JTextField amount, dt;
	static JComboBox <String> category;
	static JTextArea remarks;
	static JButton save, reset;

       static public void main(String [] rk)
       {
		jf.setSize(650, 900);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);

		amount = new JTextField(20);
		dt = new JTextField("YYYY-MM-dd", 20);
		remarks = new JTextArea(5, 20);
		save = new JButton("Save");
		reset  = new JButton("Reset");
		
		String [] items = {"Food", "Transportation", "Housing / Home",  "Bills & Utilities", "Shopping", "Education" , "Health & Medical" ,  " Entertainment", "Travel" , "Miscellaneous" };

		category = new JComboBox<String>(items);

		Font f = new Font("Serif", 1, 36);
		JLabel amt = new JLabel("Amount");
		amt.setFont(f);
		JLabel ctg = new JLabel("Category");
		ctg.setFont(f);
		JLabel date = new JLabel("Date");
		date.setFont(f);
		JLabel rm = new JLabel("Remarks");
		rm.setFont(f);
	
		save.setFont(f);
		reset.setFont(f);
								Font f2 = new Font("Serif", 0, 24);
		category.setFont(f2);
		amount.setFont(f);
		remarks.setFont(f2);
		dt.setFont(f2);

		//Manual placement of components

		jf.setLayout(null);

//Category
		jf.add(ctg); 			ctg.setBounds(100, 200, 150, 60);
		jf.add(category); 		category.setBounds(300, 200, 250, 60);

//Amount
		jf.add(amt); 			amt.setBounds(100, 300, 150, 60);
		jf.add(amount); 		amount.setBounds(300, 300, 250, 60);

//Date
		jf.add(date); 			date.setBounds(100, 400, 150, 60);
		jf.add(dt); 			dt.setBounds(300, 400, 250, 60);

//Remarks
		jf.add(rm); 			rm.setBounds(100, 500, 150, 60);
		jf.add(remarks); 		remarks.setBounds(300, 500, 250, 150);

//Buttons

		jf.add(save); 			save.setBounds(150, 700, 350, 40);
		jf.add(reset); 			reset.setBounds(150, 770, 350, 40);



		jf.setVisible(true);
       }
}
