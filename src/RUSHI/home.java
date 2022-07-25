package RUSHI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class home extends JFrame implements ActionListener
{
  
  JMenuBar mb1;
  JMenu m1,m2,m3,m4,m5;
  JMenuItem m1i1,m1i3,m1i5,m1i6;
  JMenuItem m2i1; 
  JMenuItem m5i1,m5i2,m5i3;
  
  JMenuItem m4i1;
  
  JMenuItem m3i1,m3i2;
  
  JTabbedPane pn;

  
 
 
  home()
   {
    super("Admission of students");
   
    
    //menubar
    mb1=new JMenuBar();

    m1=new JMenu("Forms");
    m2=new JMenu("Scholarship Form");
    m3=new JMenu("Report");
    m4=new JMenu("Cash Tally");
    m5=new JMenu("Transaction");
    
    //first menu MenuItems 
    m1i1=new JMenuItem("Admission");
    m1i3=new JMenuItem("Exam Receipt");
    
    m1i5=new JMenuItem("LC/TC Certificate");
    m1i6=new JMenuItem("Exit");
    m3i1=new JMenuItem("Merit List");
    m3i2=new JMenuItem("Class Wise record"); 
      
    m4i1=new JMenuItem("Tally Form");
    m2i1=new JMenuItem("Scholarship Form");
   
    m5i1 = new JMenuItem("Update Record");
    m5i2 = new JMenuItem("Delete Record");
    m5i3 = new JMenuItem("Display Record");
    
   //set Action Listeners
    m1i1.addActionListener(this);
   
    m1i3.addActionListener(this);
    m1i6.addActionListener(this);
    
    m1i5.addActionListener(this); 
   
    m2i1.addActionListener(this); 
    m3i1.addActionListener(this);   
    m3i2.addActionListener(this); 
        
    m4i1.addActionListener(this);     
      
    m5i1.addActionListener(this); 
    m5i2.addActionListener(this);     
    m5i3.addActionListener(this);     
    
    setJMenuBar(mb1);
    mb1.add(m1);mb1.add(m5);mb1.add(m2);mb1.add(m3);mb1.add(m4);
    
    m3.add(m3i1); m3.add(m3i2);   
    m1.add(m1i1);m1.add(m1i3);m1.add(m1i5);m1.add(m1i6);
    m2.add(m2i1);
    m4.add(m4i1);
    m5.add(m5i1);m5.add(m5i2);m5.add(m5i3);
    
    setLayout(null);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setSize(1024,768);
    setVisible(true);
   
  }

 public void actionPerformed(ActionEvent aa1)
 {
   String s1=aa1.getActionCommand();
   System.out.println("Cmd  : " + s1);
 
    if(s1.equals("Admission"))
    {
       admission a1=new admission();
    }
    
   else
     if(s1.equals("Exam Receipt"))
      {
       ExamReceipt e1=new ExamReceipt();
      }
    
   else
      if(s1.equals("LC/TC Certificate"))
       {
            lc l1=new lc();
       }
         
   else
     if(s1.equals("Exit"))
         {
             System.exit(0);
         }
         
    else
       if(s1.equals("Update Record"))
         {
         	 
         	 UpdateRecord up=new UpdateRecord();
         }	 
	else
       if(s1.equals("Delete Record"))
       {
            
             DeleteRecord d=new DeleteRecord();
       }    
	
    else
       if(s1.equals("Display Record"))
       {
              
             DisplayRecord dr=new DisplayRecord();
       }    
	
          
    else    
       if(s1.equals("Class Wise record"))
       {
             how h1=new how();
       }
         
    else 
       if(s1.equals("Scholarship Form"))
       {
             scholar ss1 = new scholar();  
       }
         
    else 
       if(s1.equals("Tally Form"))
       {
             cashtally ct = new cashtally();
       }
         
    else
       if(s1.equals("Merit List"))
       {
             merit m1 = new merit();
       }
         
        
    }

}
