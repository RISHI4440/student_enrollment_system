package RUSHI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class lc1 extends JPanel
{ 
 
 JTextField t1,t2,t3,t4,t5,t6,t7,t8,t10,t11;
 JLabel l1,l2,l3,l4,l5,l6,l8,l9,l10,l11,l12;
 JComboBox cb1,cb2;

 lc1() 
  {
   t1=new JTextField();
   t2=new JTextField();
   t3=new JTextField();
   t4=new JTextField();
   t5=new JTextField();
   t6=new JTextField();
   t7=new JTextField();
   t8=new JTextField();
   
   t10=new JTextField();
   t11=new JTextField();
  
   l1=new JLabel("Date:");
   l2=new JLabel("College Reg. No.:");
   l3=new JLabel("Name:                                      Sur Name                             Your Name                          Father Name");
   l4=new JLabel("Caste");
   l5=new JLabel("Place Of Birth:");
   l6=new JLabel("Date Of Birth:");
   
   l8=new JLabel("Date Of Admission:");
   l9=new JLabel("Nature:");
   l10=new JLabel("Study Level:");
   l11=new JLabel("Leaving Date:");
   l12=new JLabel("LC/TC Certificate:");
   
   Font f=new Font("Helvetica",Font.BOLD+Font.ITALIC,20);
   l12.setFont(f);

   String nat[]={"Good","Bad","Better"};
   String sl[]={"High","Medium","Low"};
 
   cb1=new JComboBox(nat);
   cb2=new JComboBox(sl);
    
   l1.setBounds(30,40,120,20);
   t1.setBounds(180,40,120,20);
   
   l2.setBounds(30,80,120,20);
   t2.setBounds(180,80,120,20);  
     
   l3.setBounds(30,120,580,20);
   t3.setBounds(180,140,120,20);  
   t4.setBounds(320,140,120,20);  
   t5.setBounds(460,140,120,20);  
     
   l4.setBounds(30,180,120,20);
   t6.setBounds(180,180,120,20);  
     
   l5.setBounds(30,220,120,20);
   t7.setBounds(180,220,120,20);  
   
   l6.setBounds(30,260,120,20);
   t8.setBounds(180,260,120,20);  
   
   l8.setBounds(30,300,120,20);
   t10.setBounds(180,300,120,20);  
   
   l9.setBounds(30,340,120,20);
   cb1.setBounds(180,340,120,20);  
   
   l10.setBounds(30,380,120,20);
   cb2.setBounds(180,380,120,20);
   
   l11.setBounds(30,420,120,20);
   t11.setBounds(180,420,120,20);
   
   
   l12.setBounds(30,5,200,20);
   l12.setForeground(Color.blue);
   add(l1);add(t1);add(l2);add(t2);
   add(l3);add(t3);add(t4);add(t5);
   add(l4);add(t6);add(l5);add(t7);
   add(l6);add(t8);
   add(l8);add(t10);add(l9);add(cb1);
   add(l10);add(cb2);add(l11);add(t11);
   add(l12);
   setLayout(null);
   setBackground(Color.gray); 
   
     }
}     
   
class lc2 extends JPanel
{
      	
     JButton b1,b2,b3;
      	 
     lc2()
     {
      	   b1=new JButton("Home");
      	   b2=new JButton("Exit");
      	   b3=new JButton("Save");
           
           b1.setBounds(50,25,80,30);
           b2.setBounds(150,25,60,30);
           b3.setBounds(240,25,80,30);

           setLayout(null);
           add(b1);add(b2);add(b3);
           setBackground(Color.gray); 
	 }
}   

class lc extends JFrame implements ActionListener
  {
    int crno;
    String sn1,sn2,sn3,name,caste,pofb,dofb,pcollege,dofad,nature,studyl,ldate; 
    lc1 c1;
    lc2 c2;
    JButton bhome = new JButton("Home");
    String password,login,q1;
    Connection cn1;
    ResultSet rs1;
    Statement st1;

    lc()
     {
       	super("LC Certficate");

       	c1=new lc1();
       	c2=new lc2(); 
    
	    Container c = getContentPane();
                c1.setBounds(50,50,900,530);
                c2.setBounds(50,600,360,80);
	c.add(c1);
	c.add(c2);
                set_connection();
		
	bhome.addActionListener(this);
	c2.add(bhome);

                c.setBackground(Color.orange);
		
                c2.b1.addActionListener(this);
	c2.b2.addActionListener(this);
	c2.b3.addActionListener(this);
		
               setLayout(null);			
               setSize(1024, 768);
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

              crno=Integer.parseInt(c1.t2.getText());
              sn1=c1.t3.getText();
              sn2=c1.t4.getText();       
              sn3=c1.t5.getText();
              name=sn1+" "+sn2+" "+sn3;
              caste=c1.t6.getText();
              pofb=c1.t7.getText();
              dofb=c1.t8.getText();
             
              dofad=c1.t10.getText();
              nature=String.valueOf(c1.cb1.getSelectedItem());
              studyl=String.valueOf(c1.cb2.getSelectedItem());
              ldate=c1.t11.getText();
           
              q1="insert into LC values("+crno+",'"+name+"','"+caste+"','"+pofb+"','"+dofb+"','"+dofad+"','"+nature+"','"+studyl+"','"+ldate+"')";
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


 