package org.example;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

//GUI
//TextField = input
//          =output ?

// Jlable -> display area to texts(Strings) , image

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        JLabel l =new JLabel();
        l.setBounds(80,-40,100,100);
        l.setText("This is My page");
        l.setFont(new Font("MV Boil",Font.PLAIN,40));
        l.setVerticalTextPosition(JLabel.TOP);
        ImageIcon m=new ImageIcon("3.jpg");
      //  l.setIcon(m);

    JFrame f=new JFrame();
    f.setVisible(true);
    f.setTitle("This is My GUI");
    f.setSize(300,300);
    //ImageIcon m=new ImageIcon("3.jpg");
//    f.setIconImage(m.getImage());
  //  f.getContentPane().setBackground(new Color(255,0,0));
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    f.add(l);
    TextField t1 =new TextField(); //حقل لإدخال المتغير الأول
    t1.setBounds(20,30,150,30);
    f.add(t1);
    TextField t2=new TextField(); //حقل لإدخال المتغير الثاني
        t2.setBounds(20, 100, 150, 30);
        f.add(t2);
    f.setLayout(null);
        Button b=new Button("Calculate");
    b.setBounds(20, 140, 150, 30);
    f.add(b);
    JLabel resultLable =new JLabel("The result will appear here"); //مكان اظهار النتائج
    resultLable.setBounds(80,180,300,20);
    resultLable.setVerticalTextPosition(JLabel.BOTTOM);
    resultLable.setForeground(Color.YELLOW);
    resultLable.setFont(new Font("MV Boli",Font.PLAIN,20));
    f.add(resultLable);
    b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
            {
                try{
                    int x=Integer.parseInt(t1.getText());
                    int y=Integer.parseInt(t2.getText());
                    int sum=x+y;
                    resultLable.setText("The summation is:"+sum);
                }
                catch (NumberFormatException ex)
                {
                    resultLable.setText("The input is not valid");
                }
            }
        });
    f.getContentPane().setBackground(Color.red);
   // f.setVisible(true);
    }
}