package RUSHI;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class h1 extends JPanel
{
   
   JLabel l1;
   JComboBox c1;
  JButton b1,b2;
  
 h1()
   {
        l1=new JLabel("Select the Class : ");
        String str[]={"FYBCS","SYBCS","TYBCS","FYBBA","SYBBA","TYBBA",
                            "FYBCA","SYBCA","TYBCA","FYBIO-TECH","SYBIO-TECH","TYBIO-TECH"}; 
    	
       c1=new JComboBox(str); 
       b1=new JButton("Show");
       b2=new JButton("Clear");  
      
       l1.setBounds(20,20,130,30);
      c1.setBounds(170,20,90,30);
      b1.setBounds(280,20,80,30);
      b2.setBounds(380,20,80,30);

      setBackground(Color.gray);
      setLayout(null);
      add(l1);add(c1);add(b1);add(b2);
    }
}

class h2 extends JPanel
{ 
  h2() 
   {
       setBackground(Color.gray);
   }
}

class h3 extends JPanel
 { 
  JButton b1,b2;
  
  h3()
    {
     	b1=new JButton("Home");
                b2=new JButton("Exit");
               setBackground(Color.gray);
     	b1.setBounds(20,20,80,20);
     	b2.setBounds(130,20,80,20);
     	setLayout(null);
     	add(b1);add(b2);
    }
}
class how extends JFrame implements ActionListener
 {
   	JLabel l = new JLabel();
  	Container c1;
    	String q1,q2;
    	Connection cn1;
    	ResultSet rs;
    	Statement st1;
	int count = 0;
  	h1 hh1;
  	h2 hh2;
  	h3 hh3;  
  
  how()
    {
     	super("To Find How many Student in perticular field");
 
	hh1=new h1();
        	hh2=new h2();
	hh3=new h3();
	
	set_connection();

         	c1=getContentPane();

	hh1.setBounds(30,20,950,80);
         	hh2.setBounds(30,120,950,480);
               hh3.setBounds(30,620,950,80);  
         	
               c1.add(hh1);
               c1.add(hh2);
               c1.add(hh3);
               l.setBounds(30,120,950,480);
              c1.setBackground(Color.orange);

    	hh1.b1.addActionListener(this);
    	hh1.b2.addActionListener(this);
    	hh3.b1.addActionListener(this);
    	hh3.b2.addActionListener(this); 
     	setLayout(null);
     	setSize(1024,765);
     	setVisible(true);
    }

 void set_connection() 
   {
    try
     {
      	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      	cn1=DriverManager.getConnection("jdbc:odbc:mydsn");
      	st1=cn1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
	ResultSet.CONCUR_READ_ONLY);
      
     
     }
    catch(Exception e1)
     {
      	System.out.println("SQL Error"+e1);
     }
   }


   public void actionPerformed(ActionEvent a1)
    {
     	String s1=a1.getActionCommand();
     	if(s1.equals("Show"))
      	 {

       	   try
         	     {
		q2=String.valueOf(hh1.c1.getSelectedItem());         
        		q1="SELECT admission.crno, admission.sname,admission.fname, admission.addr, admission.bdate,admission.sex, admission.perc, admission.fpaid,admission.fdues FROM admission WHERE  cclass = '"+q2+"'order by crno;"; 
        
		rs=st1.executeQuery(q1);
         			
		while(rs.next())
		    {
		    	count++;
		    }
       	
	 	String[] colHeads = 			{"crno","sname","fname","addr","bdate","sex","perc","fpaid","fdues"};

                	Object[][] results=new Object[count][9];
		rs.first();
		    
	                for(int i=0;i<count;i++)
		  {
		                results[i][0]=rs.getString(1);
		    	results[i][1]=rs.getString(2);
		    	results[i][2]=rs.getString(3);
		    	results[i][3]=rs.getString(4);
                		results[i][4]=rs.getString(5);
		    	results[i][5]=rs.getString(6);
                		results[i][6]=rs.getString(7);
		    	results[i][7]=rs.getString(8);
                		results[i][8]=rs.getString(9);
		    	   
               			rs.next();
		    }			  
                   
                     JTable table = new JTable(results, colHeads);			

			int v = 			ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
			int h = 					                              	              ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

			JScrollPane jsp = new JScrollPane(table, v, h);			
 			jsp.setBounds(0, 0, 950,480);
			hh2.add(jsp, BorderLayout.CENTER);
                         
	    }

              catch(Exception e)
		{
			String dt="Message";
              			String dm="Please Click on Clear Button";
              			int dtype=JOptionPane.INFORMATION_MESSAGE;

              		        JOptionPane.showMessageDialog((Component)null,dm,dt,dtype);
		}		
          }
        else
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
              if(s1.equals("Clear"))
              {
              		c1.add(l); 
                    	q2=null;
                    	count=0;
                    	hh2.removeAll();
             }
        }
   }      