package ElizaPack;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextfieldDemo extends JFrame {
	
	JTextArea jta;
	JScrollPane jsp;
	
	
   public TextfieldDemo(){
	   jta=new JTextArea(20,20);
	   jsp=new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	   
	   setLayout(new FlowLayout());
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   add(jsp);
	   setSize(300,390);
	   setTitle("File Display");
	   setLocationRelativeTo(null);
	   
	   setVisible(true);
	   
   }
   
   
   public static void main(String[] args) {
	   new TextfieldDemo();
   }
	
}
