package RUSHI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

class logpass extends JFrame implements ActionListener
{
  JLabel l1,l2,l3;
  JTextField t1,t2;
  JButton b1,b2,b3;
  String log,pw;

  Connection cn1;
  ResultSet rs1;
  Statement st1;

 logpass()
  {
   super("Administrator Account");
   l1=new JLabel("Login");
   l2=new JLabel("Password");
   l3=new JLabel("College Admission System");
   Font f=new Font("Helvetica",Font.BOLD+Font.ITALIC,50);
   l3.setFont(f);
   l3.setForeground(Color.yellow);  
   l1.setForeground(Color.black); 
   l2.setForeground(Color.black);  
   t1=new JTextField();
   t2=new JPasswordField();
   //t2.setEchoChar('*');  
   

   b1=new JButton("Next");
   b2=new JButton("Clear");
   b3=new JButton("Exit");

   set_connection();

   l1.setBounds(450,350,80,20);
   l2.setBounds(450,380,80,20);
   l3.setBounds(180,100,700,50);
   t1.setBounds(535,350,100,20);
   t2.setBounds(535,380,100,20);
   b1.setBounds(900,660,80,25);
   b2.setBounds(690,660,80,25);
   b3.setBounds(795,660,80,25);
   Container c=getContentPane();
   c.setLayout(null);
   c.setBackground(Color.gray);

   add(l3);add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);add(b3);
  
   
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   
   setSize(1024,768);
   setVisible(true);
  }

void set_connection() 
   {
    try
     {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      cn1=DriverManager.getConnection("jdbc:odbc:mydsn");
      st1=cn1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
      
     
     }
    catch(Exception e1)
     {
      System.out.println("SQL Error"+e1);
     }
   }
  public void actionPerformed(ActionEvent a1)
   {
     String s1=a1.getActionCommand();

     if(s1.equals("Exit"))
      {
        System.exit(0);
      }
     else
      if(s1.equals("Next"))
       {

         String s2=t1.getText();
         String s3=t2.getText();
               
         String s4=new String(s3.toCharArray(),0,s3.length()); 
         try
        {

         rs1=st1.executeQuery("Select * from account");
             
          while(rs1.next())
         {

          log=rs1.getString("login");
          pw=rs1.getString("password");
          
          if(s2.equals(log))
           {
            b1.setEnabled(false);
           }
         if(s4.equals(pw))
          {
           b1.setEnabled(false);
          }
         if(s2.equals(log))
          {
           if(s4.equals(pw))
            { 
                  home h1=new home(); 
                  b1.setEnabled(true);
                  setVisible(false);
             
            }
           else
            { 
             
              b1.setEnabled(false);
              t2.setText("");
              t2.requestFocus();
            }
          }
         else
          {
           
           b1.setEnabled(false); 
           t1.setText("");
           t1.requestFocus();
          }
       }

    }
    catch(Exception e1)
     {
       System.out.println("Error occurs");
     }

       }
      else
       {
         
         b1.setEnabled(true); 
         t1.setText("");
         t2.setText("");
       }
     }
  }
        



