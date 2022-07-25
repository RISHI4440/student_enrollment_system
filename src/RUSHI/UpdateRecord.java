package RUSHI;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class addpanel7 extends JPanel
{
   
   JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t16,t17;
   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l16,l17,l18;

   public addpanel7()
    {
      // Labels
      l1=new JLabel("College Reg.No.:");
      l2=new JLabel("Reciept No.:");
      l3=new JLabel("Admission Date :");
      l4=new JLabel("Student Name :");                                   
      l5=new JLabel("Father Name  :");
      l6=new JLabel("Address :");
      l7=new JLabel("Birth Date :");
      l8=new JLabel("Sex :");
      l9=new JLabel("Category :");
      l10=new JLabel("Caste :");
      l11=new JLabel("Prev class :");
      l12=new JLabel("Current class :");
      l13=new JLabel("Marks :");
      l14=new JLabel("percentage :");
      
      l16=new JLabel("Fee Paid :");
      l17=new JLabel("Fee Dues :");
      l18=new JLabel("Update Record :",JLabel.CENTER);

      Font f=new Font("Helvetica",Font.BOLD+Font.ITALIC,30);
      l18.setFont(f);

      // TextFields
      t1=new JTextField(20);
      t2=new JTextField(20);
      t3=new JTextField(20);
      t4=new JTextField(20);
      t5=new JTextField(20);
      t6=new JTextField(20);
      t7=new JTextField(20);
      t8=new JTextField(20);
      t9=new JTextField(20);
      t10=new JTextField(20);
      t11=new JTextField(20);
      t12=new JTextField(20);
      t13=new JTextField(20);
      t14=new JTextField(20);
      
      t16=new JTextField(20);
      t17=new JTextField(20);

      t1.setEnabled(true);
      t2.setEnabled(true);
      t3.setEnabled(true);
      t4.setEnabled(true);
      t5.setEnabled(true);
      t6.setEnabled(true);
      t7.setEnabled(true);
      t8.setEnabled(true);
      t9.setEnabled(true);
      t10.setEnabled(true);
      t11.setEnabled(true);
      t12.setEnabled(true);
      t13.setEnabled(true);
      t14.setEnabled(true);
    
      t16.setEnabled(true);
      t17.setEnabled(true);
      
      // fore ground
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
      l11.setForeground(Color.black);
      l12.setForeground(Color.black);
      l13.setForeground(Color.black);
      l14.setForeground(Color.black);
      
      l18.setForeground(Color.red);
      
        // Bounds
      
      l1.setBounds(20,60,120,20);
      t1.setBounds(120,60,120,20);
      
      l2.setBounds(300,60,80,20);
      t2.setBounds(380,60,120,20);
      
      l3.setBounds(20,90,130,20);
      t3.setBounds(120,90,120,20);
      
      l4.setBounds(20,120,100,20);
      t4.setBounds(120,120,280,25);
      
      l5.setBounds(20,150,100,20);
      t5.setBounds(120,150,280,25);
      
      l6.setBounds(20,180,100,20);
      t6.setBounds(120,180,280,25);
      
      l7.setBounds(20,210,100,25);
      t7.setBounds(120,210,100,25);
      
      l8.setBounds(300,210,100,25);
      t8.setBounds(380,210,120,25);
      
      l9.setBounds(20,240,100,25);
      t9.setBounds(120,240,170,25);
      
      l10.setBounds(20,270,100,25);
      t10.setBounds(120,270,170,25);
      
      l11.setBounds(20,300,100,25);
      t11.setBounds(120,300,170,25);
      
      l12.setBounds(20,330,100,25);
      t12.setBounds(120,330,170,25);
      
      l13.setBounds(20,360,100,25);
      t13.setBounds(120,360,170,25);
      
      l14.setBounds(20,390,100,25);
      t14.setBounds(120,390,170,25);
      
      l16.setBounds(20,420,100,25);
      t16.setBounds(120,420,170,25);
      
      l17.setBounds(20,450,100,25);
      t17.setBounds(120,450,170,25);
      
     l18.setBounds(230,10,300,30);
      
      add(l18);
      add(l1);add(t1);
      add(l2);add(t2);
      add(l3);add(t3);
      add(l4);add(t4);
      add(l5);add(t5);
      add(l6);add(t6);
      add(l7);add(t7);
      add(l8);add(t8);
      add(l9);add(t9);
      add(l10);add(t10);
      add(l11);add(t11);
      add(l12);add(t12);
      add(l13);add(t13);
      add(l14);add(t14);
      
      add(l16);add(t16);
      add(l17);add(t17);
     
      setLayout(null);

    }
      
   }

  class UpdateRecord extends JFrame implements ActionListener
   {
       JButton b1,b2,b3,b4,b5;
       JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17;
       int flag=0;
       int crno1;
       Connection con;
       ResultSet rs;
       Statement st;
       PreparedStatement ps;
  
       addpanel7 ap1;

  public UpdateRecord() 
    {
      super("Update Record");
      
      b1=new JButton("show");
      b2=new JButton("Cancel");
      b3=new JButton("Home");
      b4=new JButton("Update");
      b5=new JButton("Clear");
      
     //  adding listener

      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      
      addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
				try
				{
					con.close();
				}
				catch(Exception ee)
				{
					                                                                     JOptionPane.showMessageDialog(null,ee);
				}
			}
		});
    
	 
          
      b1.setBounds(900,100,100,20);
      b2.setBounds(900,170,100,20);
      b3.setBounds(900,240,100,20);
      b4.setBounds(900,310,100,20);
      b5.setBounds(900,380,100,20);
            
      Container c1=getContentPane();
      c1.setLayout(null);
     
      ap1=new addpanel7();      
      ap1.setBounds(30,30,800,670);
      c1.add(ap1);
      ap1.setBackground(Color.gray);
      c1.setBackground(Color.orange);
      c1.add(b1);
      c1.add(b2);
      c1.add(b3);
      c1.add(b4);
      c1.add(b5);
      
      setSize(1024,768);
      setVisible(true);
   
   }   
   void set_connection()
   {
   	  try
	  {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:mydsn");
			st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
			ResultSet.CONCUR_READ_ONLY);
			
	        flag = 1;	 
	  }
		 
	  catch(Exception ee)
	  {
		 	System.out.print(ee);
	  }
      
   }
   public void actionPerformed(ActionEvent ae)
   {
		if(ae.getSource()==b2)
		{
			System.exit(0);
		}
		else
		if(ae.getSource()==b1)
		{
		   try
		   {
			
			    set_connection();
                crno1=Integer.parseInt(ap1.t1.getText());
                rs=st.executeQuery("select crno,rctno,adate,sname,fname,addr,bdate,sex,cate,caste,pclass,cclass,marks,perc,fpaid,fdues from admission where crno="+crno1);
                           
			    while(rs.next())
			    {
				  	
				    ap1.t1.setText(rs.getString(1));
					ap1.t2.setText(rs.getString(2));
					ap1.t3.setText(rs.getString(3));
					ap1.t4.setText(rs.getString(4));
					ap1.t5.setText(rs.getString(5));
					ap1.t6.setText(rs.getString(6));
					ap1.t7.setText(rs.getString(7));
					ap1.t8.setText(rs.getString(8));
					ap1.t9.setText(rs.getString(9));
					ap1.t10.setText(rs.getString(10));
					ap1.t11.setText(rs.getString(11));
					ap1.t12.setText(rs.getString(12));
					ap1.t13.setText(rs.getString(13));
					ap1.t14.setText(rs.getString(14));
					ap1.t16.setText(rs.getString(15));
				    ap1.t17.setText(rs.getString(16));
               }	
   	    }
   			catch(Exception ee)
   			 {
   			 	System.out.println(ee);
   			 }
		}
		
		else
		if(ae.getSource() == b3)
		 {
		 	 home h1 = new home();
		 }
		 else
		 if(ae.getSource() == b4)
		 {
               try
               {
                      set_connection();
                      int crno1= Integer.parseInt(ap1.t1.getText());      
			      	
                      ps=con.prepareStatement("update admission set crno=?,rctno=?,adate=?,sname=?,fname=?,addr=?,bdate=?,sex=?,cate=?,caste=?,pclass=?,cclass=?,marks=?,perc=?,fpaid=?,fdues=?  where crno=? "); 
		                   
			          ps.setInt(1,crno1);  
                      ps.setString(2,ap1.t2.getText());
                      ps.setString(3,ap1.t3.getText());
                      ps.setString(4,ap1.t4.getText());  
                      ps.setString(5,ap1.t5.getText());
                      ps.setString(6,ap1.t6.getText());
                      ps.setString(7,ap1.t7.getText());
                      ps.setString(8,ap1.t8.getText());
                      ps.setString(9,ap1.t9.getText());
                      ps.setString(10,ap1.t10.getText()); 
                      ps.setString(11,ap1.t11.getText());
                      ps.setString(12,ap1.t12.getText());
                      ps.setString(13,ap1.t13.getText());
                      ps.setString(14,ap1.t14.getText()); 
                      ps.setString(15,ap1.t16.getText());
                      ps.setString(16,ap1.t17.getText());
                      ps.setInt(17,crno1);
                      ps.executeUpdate();
                      JOptionPane.showMessageDialog(null,"Record updated 			succefully","Message",JOptionPane.PLAIN_MESSAGE);  
              }
              catch(Exception ee)
   		      {
   			          System.out.print(ee);
   		      }
                      	 
		 }
         else
		 if(ae.getSource() == b5)
		 {
              try
              {
		           ap1.t1.setText("");
			       ap1.t2.setText("");
                   ap1.t3.setText("");
                   ap1.t4.setText("");
			       ap1.t5.setText("");
			       ap1.t6.setText("");
                   ap1.t7.setText("");
                   ap1.t8.setText("");
                   ap1.t9.setText("");
		           ap1.t10.setText("");
			       ap1.t11.setText("");
			       ap1.t12.setText("");
			       ap1.t13.setText("");
			       ap1.t14.setText("");
			       ap1.t16.setText("");
		           ap1.t17.setText("");
                                       
                   rs.close();
                   st.close();
                   con.close();
              }
              catch(Exception ee)
   		      {
   			        System.out.print(ee);
   		      }
                      	 
		}
                  
	}
	
	
}
