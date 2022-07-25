package RUSHI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

class welcome extends JFrame implements ActionListener
{
   
    JButton b1;

    welcome()
     {
       
       super("Welcome");
       b1=new JButton();
       Container c1=getContentPane();
       b1.setBounds(0,0,1024,768);
       b1=new JButton("temp",new ImageIcon("abc.JPG"));
       c1.add(b1);
       b1.addActionListener(this); 
       setSize(1024,768);
       setVisible(true);
     }
   public void actionPerformed(ActionEvent a1)
   {   
     String s1=a1.getActionCommand();
  
     if(s1.equals("temp"))
        {
          setVisible(false);
          logpass l1=new logpass();
        }
    }
 }


