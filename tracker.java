import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

class tracker {
    static JFrame jf = new JFrame("Expense Tracker");
    static JTextField amount, dateText;
    static JComboBox<String> category;
    static JTextArea remarks; 
    static JButton save, reset;

    public static void main(String[] rk) {
        jf.setSize(600, 800);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        jf.setLocationRelativeTo(null);

        amount = new JTextField();
        dateText = new JTextField(); 
        remarks = new JTextArea(5, 20); 
        save = new JButton("Save");
        reset = new JButton("Reset");

        String[] items = {"Food", "Transportation", "Housing", "Bills", "Eduction", "Health", "Travel", "Medical", "Miscellaneous"};
        category = new JComboBox<String>(items);
        Font f = new Font("serif", 1, 36);
        
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
        category.setFont(f);
        remarks.setFont(f);
        dateText.setFont(f);
        amount.setFont(f); // This line scales up the text input inside the amount box

        save.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String amtData = amount.getText().trim();
                String catData = (String) category.getSelectedItem();
                String dateData = dateText.getText().trim();
                String remData = remarks.getText().trim();

                if (amtData.isEmpty() || dateData.isEmpty()) {
                    JOptionPane.showMessageDialog(jf, "Please fill in both Amount and Date!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    FileWriter fw = new FileWriter("X:\\VScode\\JAVA\\expenses.txt", true);
                    PrintWriter pw = new PrintWriter(fw);

                    pw.println("=====================================");
                    pw.println("Date:     " + dateData);
                    pw.println("Category: " + catData);
                    pw.println("Amount:   " + amtData);
                    pw.println("Remarks:  " + (remData.isEmpty() ? "None" : remData));
                    pw.println("=====================================");
                    pw.println();

                    pw.close();
                    fw.close();

                    JOptionPane.showMessageDialog(jf, "Expense Saved Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                    amount.setText("");
                    dateText.setText("");
                    remarks.setText("");
                    category.setSelectedIndex(0);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(jf, "Error writing to file!", "File Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                amount.setText("");
                dateText.setText("");
                remarks.setText("");
                category.setSelectedIndex(0);
            }
        });

        jf.setLayout(null);
        
        jf.add(ctg);
        ctg.setBounds(50, 100, 150, 60);
        jf.add(category);
        category.setBounds(250, 100, 280, 60);

        jf.add(amt);
        amt.setBounds(50, 200, 150, 60);
        jf.add(amount);
        amount.setBounds(250, 200, 280, 60);

        jf.add(date);
        date.setBounds(50, 300, 150, 60);
        jf.add(dateText);
        dateText.setBounds(250, 300, 280, 60);

        jf.add(rm);
        rm.setBounds(50, 400, 150, 60);
        jf.add(remarks);
        remarks.setBounds(250, 400, 280, 120);

        jf.add(save);
        save.setBounds(80, 580, 180, 60);
        jf.add(reset);
        reset.setBounds(320, 580, 180, 60);

        jf.setVisible(true);
    }
}