import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class ThreeRadioButtons  extends JFrame {
ThreeRadioButtons (){
     JRadioButton Small = new JRadioButton("Small");
     JRadioButton Medium = new JRadioButton("Medium");
     JRadioButton Large = new JRadioButton("Large");
     ButtonGroup RadioButtons = new ButtonGroup();
     RadioButtons.add(Small);
     RadioButtons.add(Medium);
     RadioButtons.add(Large); 
     this.setSize(400,400);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLayout( new FlowLayout());
     this.add(Small);
     this.add(Medium);
     this.add(Large);
     Small.setSelected(true);
     this.setVisible(true);
 }
public static void main(String args[]){
   ThreeRadioButtons RBttons = new ThreeRadioButtons();
}

}