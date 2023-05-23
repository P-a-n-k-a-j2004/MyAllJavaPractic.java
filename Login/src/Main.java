import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    Main(){
        setSize(800,400);//This code is use for creating the frame
        setTitle("AUTOMATIC TALLER MACHINE");//This code is use for set Title in frame
        setVisible(true);//this code is use for visible the frame
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        c. setBackground(Color.BLUE);
        setLocation(350,200);//This code is use for change location of this frame
        //ImageIcon image=new ImageIcon();
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("E:\\My Java Programs\\Login\\icons\\MyLogo.jpg"));
        //image.setImage("E:\\My Java Programs\\Login\\icons\\MyLogo.jpg");
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);


    }
    public static void main(String [] args){
        new Main();
    }
}
