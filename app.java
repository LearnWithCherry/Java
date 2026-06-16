import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.sound.sampled.*;

class app{
    public static void main(String[] args) {
        JFrame fr = new JFrame("Calculator");
        fr.setSize(700,800);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setTitle("Calculator Application.");
        // fr.setColor;
        Color clr = new Color(255,255,24);
        fr.getContentPane().setBackground(clr);
        ImageIcon ic = new ImageIcon("C:\\Users\\Rajat Bhardwaj\\Downloads\\b6f3f590d948b14e7b5af46dd6120710.jpg");
        JLabel lbl = new JLabel(ic);
        fr.setContentPane(lbl);
        fr.setResizable(false);
        try{
            File ado = new File("audio.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(ado);
            Clip clp = AudioSystem.getClip();
            clp.open(audio);
            clp.start();
        }catch(Exception ex){
            System.out.println(ex);
        }
        GridLayout gl = new GridLayout(3,3);
        fr.setLayout(gl);
    Font f1 = new Font("Arial", Font.BOLD, 25);

    for(int i=1; i<10; i++){
        JButton b = new JButton(""+i);
        b.setFont(f1);
        b.setBackground(Color.blue);
        b.setBackground(Color.pink);
        fr.add(b);
    }                                                
        fr.setVisible(true);
    }
}
