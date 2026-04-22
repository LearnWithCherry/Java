import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class Main{
    public static void main(String[] args) {
        std ob = new std(roll,"Aman");
        try{
            FileOutputStream fos = new FileOutputStream("X://VScode//text.txt");    
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ob);
            oos.close();
            fos.close();
            System.out.println("Task Done");
        }catch(Exception e){
            System.out.println(e.getMessage());    
        }
        /* 
        // Writing into File
        try{
            FileWriter w = new FileWriter("X://VScode//text.txt");
            w.write("If u see this means u are reading from the file....");
            w.close();
            System.out.println("Done");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        // Using Byte Stream.......
        try{
            FileOutputStream file = new FileOutputStream("X://VScode//text.txt");
            String s = "This is an example of output Stream...";
            file.write(s.getBytes());
        }catch(Exception e){
            System.out.println(e.getMessage());

        }
        try{
            FileInputStream f = new FileInputStream("X://VScode//text.txt");
            int data;
            while((data = f.read()) != -1){
                System.out.print((char)data);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            FileWriter w = new FileWriter("X://VScode//text.txt");
            w.write("Bitch you can't even code!!!");
            w.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            File f = new File("X://VScode//text.txt");
            Scanner sc = new Scanner(f);
            System.out.println("File Data: ");
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        // Reading from File
        try{
            File f = new File("X://VScode//text.txt");
            Scanner sc = new Scanner(f);

            System.out.println("Reading from File: ");
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            FileWriter fw = new FileWriter("X://VScode//text.txt");
            fw.write("Bitch you can't even code...!!!");
            fw.close();    
            System.out.println("Data Written into the file successfully.");
        }catch(Exception x){
            System.out.println(x.getMessage());    
        }
        try{
            File file = new File("X://VScode//text.txt");
            Scanner sc = new Scanner(file);
            System.out.println("Reading File data.");

            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());    
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            FileWriter fw = new FileWriter("X://VScode//text.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String s = "HAHA Bitch, you can't even code.";
            bw.write(s);
            bw.close(); 

            BufferedReader br = new BufferedReader(new FileReader("X://VScode//text.txt"));
            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
    }
}

class std implements Serializable{
    int roll;
    String name;
    std(int roll,String name){
        this.roll = roll;
        this.name = name;
    }    
}