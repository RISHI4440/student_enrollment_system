package RUSHI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class addpanel extends JPanel
{
   JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;
   JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,
                              l19,l20;

   addpanel()
    {
      // Labels
      l1=new JLabel("College Reg.No.");
      l2=new JLabel("Reciept No.");
      l3=new JLabel("Admission Date");
      l4=new JLabel("Student Name :");
      l5=new JLabel("Surname                                    Name                               Father Name");
      l6=new JLabel("Father Name :");
      l7=new JLabel("Address :");
      l8=new JLabel("Birth Date :");
      l9=new JLabel("Sex :");
      l10=new JLabel("Category :");
      l11=new JLabel("Caste :");
      l12=new JLabel("Prev class :");
      l13=new JLabel("Current class :");
      l14=new JLabel("Marks :");
      l15=new JLabel("percentage :");
      l18=new JLabel("Fee paid :");
      l19=new JLabel("Fee Dues :");
      l20=new JLabel("Admission Form");
      
      Font f=new Font("Helvetica",Font.BOLD+Font.ITALIC,30);
      l20.setFont(f);

      // TextFields
      t1=new JTextField();
      t2=new JTextField();
      t3=new JTextField();
      t4=new JTextField();
      t5=new JTextField();
      t6=new JTextField();
      t7=new JTextField();
      t8=new JTextField();
      t9=new JTextField();
      t10=new JTextField();
      t11=new JTextField();
      t12=new JTextField();
      t13=new JTextField();
      t14=new JTextField();
      
      t1.setEnabled(false);
      t2.setEnabled(false);
      t3.setEnabled(false);
      t4.setEnabled(false);
      t5.setEnabled(false);
      t6.setEnabled(false);
      t7.setEnabled(false);
      t8.setEnabled(false);
      t9.setEnabled(false);
      t10.setEnabled(false);
      t11.setEnabled(false);
      t12.setEnabled(false);
      t13.setEnabled(false);
      t14.setEnabled(false);
      
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
      l15.setForeground(Color.black);
      l18.setForeground(Color.black);
      l19.setForeground(Color.black);
      l20.setForeground(Color.blue);
      
      //Strings
    String ad[]={"DD","1","2","3","4","5","6","7","8","9","10","11","12","13",
                       "14","15","16","17","18","19","20","21","22","23","24","25",
                       "26","27","28","29","30","31"};
       
    String am[]={"MM","January","February","March","April","May","June",
                     "July","August","September","October","November","December"};
       
    String ay[]={"YYYY","2000","2001","2002","2003","2004","2005","2006",
                       "2007","2008","2009","2010","2011","2012","2013","2014",
                       "2015","2016","2017","2018","2019","2020"};

    String bd[]={"DD","1","2","3","4","5","6","7","8","9","10","11","12","13",
                      "14","15","16","17","18","19","20","21","22","23","24","25",
                      "26","27","28","29","30","31"};
  
    String bm[]={"MM","January","February","March","April","May","June",
                       "July","August","September","October","November",
                       "December"};
  
    String by[]={"YYYY","1981","1982","1983","1984","1985","1986","1987",
                      "1988","1989","1990","1991","1992","1993","1994","1995",
                      "1996","1997","1998","1999","2000"};

    String sex[]={"Male","Female"};
      
    String category[]={"SC","NT","ST","SBC","OBC","OPEN","OTHER"};
      
    String prev[]={"12th","FYBCS","SYBCS","FYBBA","SYBBA","FYBCA","SYBCA",
                       "FYBio-Tech","SYBio-Tech"};
      
    String curr[]={"FYBCS","SYBCS","TYBCS","FYBBA","SYBBA","TYBBA",
                      "FYBCA","SYBCA","TYBCA","FYBio-Tech","SYBio-Tech",
                      "TYBio-Tech"}; 
  
// Combo box
  cb1=new JComboBox(ad);
  cb2=new JComboBox(am);
  cb3=new JComboBox(ay);
  cb4=new JComboBox(bd);
  cb5=new JComboBox(bm);
  cb6=new JComboBox(by);
  cb7=new JComboBox(sex);
  cb8=new JComboBox(category);
  cb9=new JComboBox(prev);
  cb10=new JComboBox(curr);

  cb1.setEnabled(false);
  cb2.setEnabled(false);
  cb3.setEnabled(false);
  cb4.setEnabled(false);
  cb5.setEnabled(false);
  cb6.setEnabled(false);
  cb7.setEnabled(false);
  cb8.setEnabled(false);
  cb9.setEnabled(false);
  cb10.setEnabled(false);
  
 // Bounds
   l1.setBounds(20,60,120,20);
   t1.setBounds(120,60,60,20);

   l2.setBounds(210,60,80,20);
   t2.setBounds(310,60,60,20);

   l3.setBounds(390,60,130,20);
   cb1.setBounds(530,60,50,20);
   cb2.setBounds(600,60,90,20);
   cb3.setBounds(710,60,70,20);
    
  l5.setBounds(170,120,400,20);
  l4.setBounds(20,145,100,20);

  t3.setBounds(160,150,100,20);
  t4.setBounds(290,150,100,20);
  t5.setBounds(440,150,100,20);

  l6.setBounds(20,195,100,20);
  t6.setBounds(160,200,100,20);
     
  t7.setBounds(290,200,100,20);
  t8.setBounds(440,200,100,20);
       
  l7.setBounds(20,230,100,20);
  t9.setBounds(160,235,420,20);

  l8.setBounds(20,270,120,20);
  cb4.setBounds(160,270,50,20);
  cb5.setBounds(230,270,90,20);
  cb6.setBounds(340,270,70,20);

  l9.setBounds(20,310,60,20);
  cb7.setBounds(160,310,80,20);

   l10.setBounds(20,360,100,20);
   cb8.setBounds(160,360,80,20);

   l11.setBounds(20,410,80,20);
   t10.setBounds(160,410,100,20);

   l12.setBounds(20,460,100,20);
   cb9.setBounds(160,460,100,20);

   l13.setBounds(290,460,100,20);
   cb10.setBounds(420,460,100,20);

   l14.setBounds(20,510,100,20);
   t11.setBounds(160,510,100,20);

   l15.setBounds(290,510,130,20);
   t12.setBounds(420,510,100,20);

   l18.setBounds(20,560,100,20);
   t13.setBounds(160,560,100,20);
   l19.setBounds(300,560,100,20);
   t14.setBounds(420,560,100,20);
   l20.setBounds(230,10,300,30);
           
   add(l1);add(t1);
   add(l2);add(t2);add(cb10);
   add(l3);add(t3);
   add(l4);add(l5);
   add(t4);add(l6);
   add(t5);add(l7);
   add(t6);add(l8);
   add(t7);add(l9);
   add(l10);
   add(l11);
   add(t8);add(l12);
   add(l13);
   add(l14);
   add(t9);add(l15);
   add(t10);add(cb7);add(cb8);add(cb9);add(cb10);
   add(l18);add(l19);
   add(cb1);add(cb2);add(cb3);add(cb4);add(cb5);add(cb6);
   add(l18);add(t11);add(t12);add(t13);add(t14);
   add(l20);

   setLayout(null);
   }

 }

class admission extends JFrame implements ActionListener,MouseListener
{
      JButton b1,b2,b3,b4;
      Float perc;
      int crno,rctno,marks,fpaid,fdues;
      String acb1,acb2,acb3,bcb1,bcb2,bcb3,dcb1,dcb2,dcb3,adate,bdate,
      ss1,sn1,sf1,sname,fs1,fn1,ff1,fname,addr,sex,cate,caste,pclass,cclass;
      String q1;
      int flag=0;

      Connection cn1;
      ResultSet rs1;
      Statement st1;
      PreparedStatement pst1;
  
     addpanel ap1;

   admission() 
    {
   	   super("Admission");
      
               	b1=new JButton("Add");
                b2=new JButton("Save");
                b3=new JButton("Home");
                b4=new JButton("Exit");
      
     //  adding listener

         b1.addActionListener(this);
     	 b2.addActionListener(this);
     	 b3.addActionListener(this);
     	 b4.addActionListener(this);
      
    	 addMouseListener(this);          
     
	    b1.setBounds(900,100,100,20);
      	b2.setBounds(900,170,100,20);
              	b3.setBounds(900,240,100,20);
     	b4.setBounds(900,310,100,20);
     
               Container c1=getContentPane();
               c1.setLayout(null);
               set_connection();
              ap1=new addpanel();      
              ap1.setBounds(30,30,800,670);
              c1.add(ap1);
              ap1.setBackground(Color.gray);
              c1.setBackground(Color.orange);
              c1.add(b1);
              c1.add(b2);
             c1.add(b3);
             c1.add(b4); 
      
             setSize(1024,768);
            setVisible(true);
      
   }

   void editable_component(boolean flag)
    {
           ap1.t1.setEnabled(flag);
           ap1.t2.setEnabled(flag);
          ap1.t3.setEnabled(flag);
          ap1.t4.setEnabled(flag);
          ap1.t5.setEnabled(flag);
          ap1.t6.setEnabled(flag);
          ap1.t7.setEnabled(flag);
          ap1.t8.setEnabled(flag);
          ap1.t9.setEnabled(flag);
          ap1.t10.setEnabled(flag);
          ap1.t11.setEnabled(flag);
          ap1.t12.setEnabled(flag);
         ap1.t13.setEnabled(flag);
         ap1.t14.setEnabled(flag);
         ap1.cb1.setEnabled(flag);
         ap1.cb2.setEnabled(flag);
        ap1.cb3.setEnabled(flag);
        ap1.cb4.setEnabled(flag);
        ap1.cb5.setEnabled(flag);
        ap1.cb6.setEnabled(flag);
        ap1.cb7.setEnabled(flag);
        ap1.cb8.setEnabled(flag);
        ap1.cb9.setEnabled(flag);
       ap1.cb10.setEnabled(flag);
      
    }
   void set_connection() 
   {
      try
        {
      	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      	cn1=DriverManager.getConnection("jdbc:odbc:mydsn");
      	st1=cn1.createStatement();           
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
        if(s1.equals("Add"))
        {
            flag=1;
            editable_component(true);
        }
        else
        if(s1.equals("Home"))
        {
            setVisible(false);
        }
        else
        if(s1.equals("Save"))
        {
            try
            {
              	    crno=Integer.parseInt(ap1.t1.getText());
              		rctno=Integer.parseInt(ap1.t2.getText());
                        
              		acb1=String.valueOf(ap1.cb1.getSelectedItem());
              		acb2=String.valueOf(ap1.cb2.getSelectedItem());
              		acb3=String.valueOf(ap1.cb3.getSelectedItem());
	                adate=acb1+"/"+acb2+"/"+acb3;

        	        ss1=ap1.t3.getText();
 		            sn1=ap1.t4.getText();
        	     	sf1=ap1.t5.getText();
              		sname=ss1+" "+sn1+" "+sf1;
         
              		fs1=ap1.t6.getText();
              		fn1=ap1.t7.getText();
              		ff1=ap1.t8.getText();
              		fname=fs1+" "+fn1+" "+ff1;

              		addr=ap1.t9.getText();

              		bcb1=String.valueOf(ap1.cb4.getSelectedItem());
             	 	bcb2=String.valueOf(ap1.cb5.getSelectedItem());
              		bcb3=String.valueOf(ap1.cb6.getSelectedItem());
              		bdate=bcb1+"/"+bcb2+"/"+bcb3;

              		sex=String.valueOf(ap1.cb7.getSelectedItem());
              		cate=String.valueOf(ap1.cb8.getSelectedItem());
              		caste=ap1.t10.getText();
              		pclass=String.valueOf(ap1.cb9.getSelectedItem());
              		cclass=String.valueOf(ap1.cb10.getSelectedItem());
              		marks=Integer.parseInt(ap1.t11.getText());
              		perc=Float.parseFloat(ap1.t12.getText());

             		fpaid=Integer.parseInt(ap1.t13.getText());
              		fdues=Integer.parseInt(ap1.t14.getText());

              		q1="insert into admission values("+crno+","+rctno+",'"+adate+"','"+sname+"','"+fname+"','"+addr+"','"+bdate+"','"+sex+"','"+cate+"','"+caste+"','"+pclass+"','"+cclass+"',"+marks+","+perc+","+fpaid+","+fdues+")";
              			
	                st1.executeUpdate(q1);

	                String dt="Message";
              	    String dm="Record Inserted Successfully";
 	                int dtype=JOptionPane.INFORMATION_MESSAGE;

	               JOptionPane.showMessageDialog(null,dm,dt,dtype);
              }   

              catch(Exception e1)
              {
		           System.out.println("Invalid Input : "+e1.getMessage());
              }
        }
     }

     public void mouseClicked(MouseEvent m1)
     {
         if(flag==0)
         {
             String dt="Message";
           	 String dm="First Clik on Add Button";
             int dtype=JOptionPane.INFORMATION_MESSAGE;
             JOptionPane.showMessageDialog(null,dm,dt,dtype);
         }
     }

      public void mouseEntered(MouseEvent m1){}
      public void mouseExited(MouseEvent m1){}
      public void mousePressed(MouseEvent m1){}
      public void mouseReleased(MouseEvent m1){}
 }


