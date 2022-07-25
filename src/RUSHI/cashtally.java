package RUSHI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class ctpanel1 extends JPanel
{
    JButton b1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;

   ctpanel1()
     {
            b1=new JButton("Collection Total");
            l1=new JLabel("Details");
            l2=new JLabel("Quantity");
            l3=new JLabel("1000 *");
            l4=new JLabel("500 *");
            l5=new JLabel("100 *");
           l6=new JLabel("50 *");
           l7=new JLabel("20 *");
           l8=new JLabel("10 *");
           l9=new JLabel("5 *");
           l10=new JLabel("Coins :"); 
           l11=new JLabel("Cash Tally");
 
           t1=new JTextField();
          t2=new JTextField();
          t3=new JTextField();
          t4=new JTextField();
          t5=new JTextField();
          t6=new JTextField();
          t7=new JTextField();
          t8=new JTextField();
          t9=new JTextField();
     
        t1.setText("0");     
        t2.setText("0");  
        t3.setText("0");
        t4.setText("0"); 
        t5.setText("0");
        t6.setText("0"); 
        t7.setText("0");
        t8.setText("0");
        t9.setText("0000");

       Font f=new Font("Helvetica",Font.BOLD+Font.ITALIC,20);
       l11.setFont(f);
      
       l1.setBounds(20,50,80,30);
       l2.setBounds(130,50,100,30);
      
       l3.setBounds(20,100,80,30);
       t1.setBounds(130,100,80,30);
      
      l4.setBounds(20,140,100,30);
      t2.setBounds(130,140,80,30);
      
      l5.setBounds(20,180,400,30);
      t3.setBounds(130,180,80,30);
      
      l6.setBounds(20,220,80,30);
      t4.setBounds(130,220,80,30);
      
      l7.setBounds(20,260,80,30);
      t5.setBounds(130,260,80,30);
      
      l8.setBounds(20,300,80,30);
      t6.setBounds(130,300,80,30);
      
      l9.setBounds(20,340,80,30);
      t7.setBounds(130,340,80,30);
      
      l10.setBounds(20,380,80,30);
      t8.setBounds(130,380,80,30);
      
      l11.setBounds(20,10,200,40);
   
      b1.setBounds(20,450,180,30);
      t9.setBounds(220,450,80,30);
      
      
      l11.setForeground(Color.blue);
      l1.setForeground(Color.black);
      l2.setForeground(Color.black);
      l3.setForeground(Color.black);
      l4.setForeground(Color.black);
      l5.setForeground(Color.black);
      l6.setForeground(Color.black);
      l7.setForeground(Color.black);
      l8.setForeground(Color.black);
      l9.setForeground(Color.black);
      l10.setForeground(Color.black);
  
      setLayout(null);
      setBackground(Color.gray); 
           
      add(b1);
      add(l1);add(l2);add(l3);add(l4);
      add(l5);add(l6);add(l7);add(l8);
      add(l9);add(l10);add(l11);
      add(t1);add(t2);add(t3);add(t4);add(t5);
      add(t6);add(t7);add(t8);add(t9);
       }
}

class ctpanel2 extends JPanel
  {
      	
         JButton b2,b3;
      	 
           ctpanel2()
      	     {
                
	                b2=new JButton("Home");
                	b3=new JButton("Exit");

            	                b2.setBounds(60,30,80,30);
                	b3.setBounds(160,30,80,30);

	               	setLayout(null);
                	setBackground(Color.gray); 
                	add(b2);add(b3);
      	    }
  }   


class cashtally extends JFrame implements ActionListener
{
   
    ctpanel1 e1;
    ctpanel2 e2;
    int d1=0,d2=0,d3=0,d4=0,d5=0,d6=0,d7=0,d8=0,d9=0;
    
     Connection cn1;
     ResultSet rs1;
     Statement st1;  

     cashtally()
        {    
	          super("Cash Tally");
          	         Container c1=getContentPane();
   
                         c1.setLayout(null);
	        e1=new ctpanel1();
          	        e1.setBounds(50,40,800,500);
                        c1.setBackground(Color.orange); 
          
                       e2=new ctpanel2();
                      e2.setBounds(260,610,260,80);

                     // set Listener
          	     e1.b1.addActionListener(this);
                    e2.b2.addActionListener(this);
                    e2.b3.addActionListener(this);
                    set_connection();
                   c1.add(e1);
                   c1.add(e2); 
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

	         if(s1.equals("Home"))
          		{
           			setVisible(false);
       	                }
        	        else
         	       if(s1.equals("Exit"))
          		{	
           			System.exit(0);
          		}
	         else
                         if(s1.equals("Collection Total"))
                            {
                              try
                                 {

		                 d1=1000*(Integer.parseInt(e1.t1.getText())); 
		                 d2=500*(Integer.parseInt(e1.t2.getText()));
		                 d3=100*(Integer.parseInt(e1.t3.getText()));
        	         		d4=50*(Integer.parseInt(e1.t4.getText()));  
                 		d5=20*(Integer.parseInt(e1.t5.getText())); 
                 		d6=10*(Integer.parseInt(e1.t6.getText()));  
                 		d7=5*(Integer.parseInt(e1.t7.getText())); 
                 		d8=Integer.parseInt(e1.t8.getText());                
                 		d9=d1+d2+d3+d4+d5+d6+d7+d8;
                  		e1.t9.setText(String.valueOf(d9));
                 	}
               catch(Exception e1)
                  	{
                   		System.out.println("Invalid Input :"+e1.getMessage());
                 	}                    
                           }                  
              }
}

  

