package RUSHI;

// Exam Receipt

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class erpanel1 extends JPanel
{
    JButton b1;
    JComboBox cb1,cb2,cb3,cb4;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;


    erpanel1()
     {
      String ed[]={"DD","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
             "16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
      
      String em[]={"MM","January","February","March","April","May","June","July",
                          "August","September","October","November","December"};
     
      String ey[]={"YYYY","2000","2001","2002","2003","2004","2005","2006","2007",
                        "2008","2009","2010","2011","2012","2013","2014","2015","2016",
                       "2017","2018","2019","2020"};

      String c[]={"FYBCS","SYBCS","TYBCS","FYBBA","SYBBA","TYBBA","FYBCA",
                      "SYBCA","TYBCA","FYBIOTECH","SYBIOTECH","TYBIOTECH"};

      cb1=new JComboBox(ed);
      cb2=new JComboBox(em);
      cb3=new JComboBox(ey);
      cb4=new JComboBox(c);

      b1=new JButton("Total");

      l1=new JLabel("Date :");
      l2=new JLabel("College Reg.No :");
      l3=new JLabel("Receipt No :");
      l4=new JLabel("Student Name :");
      l5=new JLabel("     Surname                               Name                               Father's                                Name");
      l6=new JLabel("Class :");
      l7=new JLabel("Exam Fee :");
      l8=new JLabel("Form Fee :");
      l9=new JLabel("Late Fee :");
      l10=new JLabel("Exam Receipt -");
   
      l10.setForeground(Color.blue);
 
      t1=new JTextField();
      t2=new JTextField();
      t3=new JTextField();
      t4=new JTextField();
      t5=new JTextField();
      t6=new JTextField();
      t7=new JTextField();
      t8=new JTextField();
      t9=new JTextField();
      
      Font f=new Font("Helvetica",Font.BOLD+Font.ITALIC,20);
      l10.setFont(f);
      
      l1.setBounds(20,40,80,30);
      cb1.setBounds(110,40,80,30);
      cb2.setBounds(200,40,80,30);
      cb3.setBounds(290,40,80,30);
      l2.setBounds(420,40,100,30);
      t1.setBounds(540,40,80,30);
      l3.setBounds(20,90,80,30);
      t2.setBounds(120,90,80,30);
      l4.setBounds(20,130,100,30);
      l5.setBounds(120,130,400,30);
      t3.setBounds(120,170,120,30);
      t4.setBounds(250,170,120,30);
      t5.setBounds(390,170,120,30);
      l6.setBounds(20,210,80,30);
      cb4.setBounds(120,210,80,30);
      l7.setBounds(20,250,80,30);
      t6.setBounds(120,250,80,30);
      l8.setBounds(20,290,80,30);
      t7.setBounds(120,290,80,30);
      l9.setBounds(20,330,80,30);
      t8.setBounds(120,330,80,30);
      b1.setBounds(20,370,80,30);
      t9.setBounds(120,370,120,30);
      l10.setBounds(20,0,200,20);
      setBackground(Color.gray);
    
      setLayout(null);
      
      add(b1);
      add(l1);add(l2);add(l3);add(l4);
      add(l5);add(l6);add(l7);add(l8);
      add(l9);add(l10);
      add(t1);add(t2);add(t3);add(t4);add(t5);
      add(t6);add(t7);add(t8);add(t9);
      add(cb1);add(cb2);add(cb3);add(cb4);
     }
}

class erpanel2 extends JPanel
  {
      	
         JButton b1,b2,b3;
      	 
           erpanel2()
      	     {
	                b1=new JButton("Save");
                	b2=new JButton("Home");
                	b3=new JButton("Exit");

                	b1.setBounds(50,30,80,30);
                	b2.setBounds(140,30,80,30);
                	b3.setBounds(240,30,80,30);

                	setLayout(null);
                	setBackground(Color.gray); 
                	add(b1);add(b2);add(b3);
      	    }
  }   


class ExamReceipt extends JFrame implements ActionListener
  {
        int crno,rctno,efee,ffee,lfee,total;
        String ecb1,ecb2,ecb3,cb4,ss1,sf1,sn1,eclass,q1,edate,sname,st;
   
        erpanel1  e1;
        erpanel2 e2;

    	Connection cn1;
    	ResultSet rs1;
    	Statement st1;
    	PreparedStatement pst1;


    	ExamReceipt()
        {    
          	super("Exam Form");
            Container c1=getContentPane();
   
            c1.setLayout(null);
          	e1=new erpanel1();
          	e1.setBounds(50,50,700,400);

          	set_connection();

          	e2=new erpanel2();
          	e2.setBounds(50,500,360,80);

            // set Listener
          	e2.b1.addActionListener(this);
          	e2.b2.addActionListener(this);
          	e2.b3.addActionListener(this);
          	c1.setBackground(Color.orange);
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

           if(s1.equals("Total"))
           {
         	total=Integer.parseInt(e1.t6.getText())+Integer.parseInt(e1.t7.getText())+
	        Integer.parseInt(e1.t8.getText());
         	st=String.valueOf(total);
         	e1.t9.setText(st);

           }
          else
   
          if(s1.equals("Save"))
          {
              try
              {
              
               		crno=Integer.parseInt(e1.t1.getText()); 
              		efee=Integer.parseInt(e1.t6.getText());
             		ffee=Integer.parseInt(e1.t7.getText());
              		lfee=Integer.parseInt(e1.t8.getText());
              		total=Integer.parseInt(e1.t9.getText());
              	
              		q1="insert into exam values("+crno+","+efee+","+ffee+","+lfee+","+total+")";
              		st1.executeUpdate(q1);

              		String dt="Message";
             		String dm="Record Inserted Successfully";
              		int dtype=JOptionPane.INFORMATION_MESSAGE;

              		JOptionPane.showMessageDialog((Component)null,dm,dt,dtype);
             }

             catch(Exception ccc1)
             {

              		System.out.println("Invalid Input : "+ccc1.getMessage());
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
     }

}

  

