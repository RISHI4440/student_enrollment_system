package RUSHI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class sscpanel1 extends JPanel
{ 
        JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9;
        JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17;
        JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;  
  sscpanel1()
   {
    
   String hd[]={"HS","DS"};
   String sex[]={"Male","Female"};
   String at[]={"Grant","Non- Grant"};
   String cat[]={"SC","NT","ST","OBC","OPEN","OTHER"};
   String cas[]={"Kunbi","Musalman","Nirhali"};
   String scas[]={"Kunbi","Musalman","Nirhali"};
   String fs[]={"Freeship","Scholarship"};
   String 
   prev[]={"12th","FYBCS","SYBCS","FYBBA","SYBBA","FYBCA","SYBCA","FYBIOTECH",
              "SYBIOTECH"};
   String curr[]={"FYBCS","SYBCS","TYBCS","FYBBA","SYBBA","TYBBA",
                         "FYBCA","SYBCA","TYBCA","FYBIOTECH","SYBIOTECH","TYBIOTECH"}; 
	
	
   	l0 =new JLabel("ScholarShip/Freeship Form :");
  	l0.setForeground(Color.blue);

  	l1 =new JLabel("College Reg. No.:");
   	t1=new JTextField();

	l2 =new JLabel("Freship/Scholarship");
	cb1=new JComboBox(fs);

	l3 =new JLabel("Receipt No:");
	t2=new JTextField();

	l4 =new JLabel("Admission Date:");
	t3=new JTextField();

	l5 =new JLabel("Student Name:          Surname                   Name                    	Father ");
	
	t4=new JTextField();
    	t5=new JTextField();
    	t6=new JTextField();
	l6 =new JLabel("Father Name: ");	
	
	t7=new JTextField();
    	t8=new JTextField();
    	t9=new JTextField();

	l7 =new JLabel("Address:                  Area                        City                          	State");
	t10=new JTextField();
    	t11=new JTextField();
    	t12=new JTextField();
	
	l8 =new JLabel("Date of Birth");
	t13=new JTextField();

	l9 =new JLabel("Sex");
	
	cb2=new JComboBox(sex);
	l10 =new JLabel("Admission Type");
	cb3=new JComboBox(at);
	
	l11 =new JLabel("Category");
	cb4=new JComboBox(cat);
	
	l12 =new JLabel("Caste");
	cb5=new JComboBox(cas);
	
	l13 =new JLabel("Subcaste");
	cb6=new JComboBox(scas);
	
	l14 =new JLabel("Prev. Class");
	cb7=new JComboBox(prev);
	
	l15 =new JLabel("Curr. Class");
	cb8=new JComboBox(curr);
	
	l16 =new JLabel("Marks");
	t14=new JTextField();

	l17 =new JLabel("Perc.");
    	t15=new JTextField();
	
	l19 =new JLabel("Income");
    	t16=new JTextField();
	
	l20 =new JLabel("Bank A/C No.");
	t17=new JTextField();
	
	l0.setBounds(20,10,500,40);
	
	l1.setBounds(20,60,120,20);
	t1.setBounds(160,60,80,20);
	
	l2.setBounds(260,60,120,20);
	cb1.setBounds(380,60,120,20);
	
	l3.setBounds(520,60,80,20);
	t2.setBounds(640,60,80,20);
	
	l4.setBounds(20,100,160,20);
    	t3.setBounds(160,100,80,20);
	
	l5.setBounds(20,140,400,20);
    	t4.setBounds(120,180,80,20);
	t5.setBounds(220,180,80,20);
	t6.setBounds(320,180,80,20);
	
	l6.setBounds(20,220,80,20);
    	t7.setBounds(120,260,80,20);
	t8.setBounds(220,260,80,20);
	t9.setBounds(320,260,80,20);

	l7.setBounds(20,300,600,20);
	t10.setBounds(120,340,80,20);
	t11.setBounds(220,340,80,20);
	t12.setBounds(320,340,80,20);

	l8.setBounds(20,380,80,20);
	t13.setBounds(120,380,80,20);

	l9.setBounds(220,380,80,20);
	cb2.setBounds(280,380,80,20);

	l10.setBounds(420,380,120,20);
	cb3.setBounds(550,380,80,20);

	l11.setBounds(20,420,80,20);
    	cb4.setBounds(120,420,80,20);

	l12.setBounds(220,420,80,20);
    	cb5.setBounds(280,420,80,20);

	l13.setBounds(420,420,80,20);
    	cb6.setBounds(550,420,80,20);

	l14.setBounds(20,460,80,20);
    	cb7.setBounds(120,460,80,20);

	l15.setBounds(220,460,80,20);
    	cb8.setBounds(320,460,80,20);

	l16.setBounds(20,500,80,20);
	t14.setBounds(120,500,80,20);

	l17.setBounds(220,500,80,20);
	t15.setBounds(320,500,80,20);

	l19.setBounds(20,540,80,20);
	t16.setBounds(120,540,80,20);

	l20.setBounds(220,540,80,20);
    	t17.setBounds(320,540,80,20);

	setBackground(Color.gray);  
	setLayout(null); 
	
   	add(l0);add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);add(l9);
   	add(l10);add(l11);add(l12);add(l13);add(l14);add(l15);add(l16);add(l17);
   	add(l19);add(l20);

   	add(cb1);add(cb2);add(cb3);add(cb4);add(cb5);add(cb6);add(cb7);add(cb8);

   	add(t1);add(t2);add(t3);add(t4);add(t5);add(t6);add(t7);add(t8);add(t9);add(t10);
   	add(t11);add(t12);add(t13);add(t14);add(t15);add(t16);add(t17);
   }

}
class sscpanel2 extends JPanel
{ 
	
  JButton b1,b2,b3;	
  
  sscpanel2()
   {
      
    	b1=new JButton("Home");
    	b2=new JButton("Save");
    	b3=new JButton("Exit");
    
    	b1.setBounds(80,30,80,30);
    	b2.setBounds(180,30,80,30);
    	b3.setBounds(280,30,80,30);
    	add(b1); add(b2); add(b3); 
    	setLayout(null);
    	setBackground(Color.gray);   
   }
}

class scholar extends JFrame implements ActionListener
 {
    int crno,rno,marks,income,bacno;
    String fs,adate,sn1,sn2,sn3,sname,fname,fn1,fn2,fn3,addr,ad1,ad2,ad3,dofb,
                                              sex,atype,category,caste,subcaste,pclass,cclass,q1;
    float perc;      
    Connection cn1;
    ResultSet rs1;
    Statement st1;    
        
     sscpanel1 ssc1;
     sscpanel2 ssc2;       
     scholar()
      {        
       	super("Scholarship Information Form");       	
       	Container c1=getContentPane();
       
       	ssc1=new sscpanel1();
       	ssc2=new sscpanel2();
         
        	ssc1.setBounds(20,20,900,590);     
        	ssc2.setBounds(20,630,400,80);
        	c1.add(ssc1);
       	c1.add(ssc2);
        	c1.setBackground(Color.orange);
         
       	ssc2.b1.addActionListener(this);
        	ssc2.b2.addActionListener(this);
        	ssc2.b3.addActionListener(this);
    
   	Font f=new Font("Helvetica",Font.BOLD+Font.ITALIC,20);
       	ssc1.l0.setFont(f);
    
    	setBackground(Color.gray); 

       	set_connection();
       	
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
       st1=cn1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
        ResultSet.CONCUR_UPDATABLE);
      
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
        if(s1.equals("Save"))
         {
              
           try
             {    
               crno=Integer.parseInt(ssc1.t1.getText());
              
               rno=Integer.parseInt(ssc1.t2.getText());  
               adate=ssc1.t3.getText();
 
               sn1=ssc1.t4.getText();
               sn2=ssc1.t5.getText();
               sn3=ssc1.t6.getText();
               sname=sn1+" "+sn2+" "+sn3; 

               fn1=ssc1.t7.getText();
               fn2=ssc1.t8.getText();
               fn3=ssc1.t9.getText();
               fname=fn1+" "+fn2+" "+fn3;
             
               ad1=ssc1.t10.getText();
               ad2=ssc1.t11.getText();
               ad3=ssc1.t12.getText();
               addr=ad1+" "+ad2+" "+ad3;
           
               dofb=ssc1.t13.getText();
               sex=String.valueOf(ssc1.cb2.getSelectedItem());
               atype=String.valueOf(ssc1.cb3.getSelectedItem());
               category=String.valueOf(ssc1.cb4.getSelectedItem());
               caste=String.valueOf(ssc1.cb5.getSelectedItem());
               subcaste=String.valueOf(ssc1.cb6.getSelectedItem());
               pclass=String.valueOf(ssc1.cb7.getSelectedItem()); 
               cclass=String.valueOf(ssc1.cb8.getSelectedItem());
               marks=Integer.parseInt(ssc1.t14.getText());
               perc=Float.parseFloat(ssc1.t15.getText());
               income=Integer.parseInt(ssc1.t16.getText());
               bacno=Integer.parseInt(ssc1.t17.getText());
 
               q1="insert into scholarship values("+crno+","+rno+",'"+adate+"','"+sname+"','"+fname+"','"+addr+"','"+dofb+"','"+sex+"','"+atype+"','"+category+"','"+caste+"','"+subcaste+"','"+pclass+"','"+cclass+"',"+marks+","+perc+","+income+","+bacno+")";
         
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
     }
     
}

          
    
  