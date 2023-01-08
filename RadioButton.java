// import java.awt.FlowLayout;
// import javax.swing.JFrame;
// import javax.swing.JProgressBar; 

// public class back {
//  /**
//  * @param args
//  */
// public static void main (String[]args){ 
//      JFrame frame = new JFrame("ACCOUNT PROGRESS"); 
// frame.setLayout(new FlowLayout()); 
// frame.setSize(500,300); 
// frame.setVisible(true); 

// JProgressBar CB= new JProgressBar(0,1000);
// frame.add(CB);
 
// CB.setStringPainted(true); 
 
// int i=0;
// while(i<=1000) {
// CB.setValue(i);
 
// try {
//     Thread.sleep(100);
// } catch (Exception e){}
//     // TODO Auto-generated catch block 
//     i=i+10;
// } 
// }
// } 
import javax.swing.*;
import javax.swing.JFrame;

public class RadioButton{ 

    JFrame f; 
         RadioButton(){ 

        f = new JFrame("U R BACK!!"); 
       
        JRadioButton r1= new JRadioButton("male");
        JRadioButton r2 = new JRadioButton("female"); 
        // JRadioButton r3 = new JRadioButton("SOHAM");
        // JRadioButton r4 = new JRadioButton("MONISH");
        r1.setBounds(75,50,100,30);
        r2.setBounds(75, 130, 100, 30);

        ButtonGroup bg = new ButtonGroup(); 
        bg.add(r1);bg.add(r2);
        f.add(r1);f.add(r2); 
        f.setSize(300,300); 
        f.setLayout(null);
        f.setVisible(true);
     }
     private void Group() {
         }
   public static void main (String[]args)
     { 
      
        new RadioButton();
     }
}
