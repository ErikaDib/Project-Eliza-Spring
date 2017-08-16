package ElizaPack;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.*;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;


public class ElizaGUI extends Eliza implements ActionListener{

	private JFrame frmTherapistEliza;
	private JFrame frmLongestwords;
	private JFrame frmFileDisplay;
	private JLabel lblNewLabelA;
	private JPanel panelA;
	//
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	//
	private JTextArea jta;
	private JScrollPane jsp;
	
	
	
	///
	
	private ArrayList<String>LongWords;
	//
	private int counter;
	//
	public void initialize() {
		
		counter=0;
		
		
		
		LongWords=new ArrayList<String>();
		
		////longest words gui
		frmLongestwords = new JFrame();
		frmLongestwords.setTitle("LongestWords");
		frmLongestwords.setBounds(100, 100, 420, 109);
		frmLongestwords.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel panelA = new JPanel();
		frmLongestwords.getContentPane().add(panelA, BorderLayout.CENTER);
		panelA.setLayout(null);
		
		lblNewLabelA = new JLabel("LongW");
		lblNewLabelA.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabelA.setBounds(10, 11, 384, 48);
		panelA.add(lblNewLabelA);
		///////////// see file gui
		frmFileDisplay=new JFrame();
		frmFileDisplay.setTitle("File Display");
		frmFileDisplay.setBounds(100,100,300,390);
		frmFileDisplay.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		jta=new JTextArea(20,20);
		jsp=new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		frmFileDisplay.add(jsp);
		
		////////////// main gui
		frmTherapistEliza = new JFrame();
		frmTherapistEliza.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\eri_k\\workspace\\ProjectEliza\\conversationimage.png"));
		frmTherapistEliza.setTitle("Therapist Eliza");
		frmTherapistEliza.setBounds(100, 100, 578, 284);
		frmTherapistEliza.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frmTherapistEliza.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(109, 157, 333, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(468, 156, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("See longest words");
		btnNewButton_1.setBounds(109, 185, 157, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("File");
		btnNewButton_2.setBounds(276, 185, 67, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Clear file");
		btnNewButton_3.setBounds(353, 185, 89, 23);
		panel.add(btnNewButton_3);
		
		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);
		btnNewButton_2.addActionListener(this);
		btnNewButton_3.addActionListener(this);
		
		lblNewLabel = new JLabel("Whats on your mind today?");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(121, 30, 322, 47);
		panel.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon(ElizaGUI.class.getResource("/ElizaPack/glasses.jpg")));
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(10, 11, 89, 81);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(ElizaGUI.class.getResource("/ElizaPack/photo - Copy.jpg")));
		lblNewLabel_2.setBounds(10, 119, 89, 76);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(ElizaGUI.class.getResource("/ElizaPack/resizedgidf.gif")));
		lblNewLabel_3.setBounds(465, 22, 79, 55);
		panel.add(lblNewLabel_3);
		
		
	}
    public String getUserInput(JTextField textField ){
    	
    	String userinput=textField.getText();
    	
    	return userinput;
    }
	
	public void changeLabel(JLabel lblNewLabel,String s){
		
		this.lblNewLabel.setText(s);
		
		
	}

	public  JLabel getLblNewLabel() {
		return lblNewLabel;
		
	}
	public void setLblNewLabel (JLabel lblNewLabel,String s) {
		this.lblNewLabel= lblNewLabel;
		lblNewLabel.setText(s);
		
		
		
	}
	public  JTextField getTextField() {
		
	
		return textField;
	}
	
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	
	public JLabel getLblNewLabelA() {
		return lblNewLabelA;
	}
	public void setLblNewLabelA(JLabel lblNewLabelA) {
		this.lblNewLabelA = lblNewLabelA;
	}
	
	/////////////
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElizaGUI window = new ElizaGUI();
					ElizaGUI window2 = new ElizaGUI();
					ElizaGUI window3 = new ElizaGUI();
					window.frmTherapistEliza.setVisible(true);
					window2.frmLongestwords.setVisible(false);
					window3.frmFileDisplay.setVisible(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		////////
	}
	

	//	
////////////		
		
	
	public ElizaGUI() {
	      initialize();
       }


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String actCdm=e.getActionCommand();
		String fileName="Therapysession.txt";
		
			
			
			String word1=getUserInput(textField);
			//ArrayList<String>LongWords=new ArrayList<String>();
			ArrayList<String>conversation=new ArrayList<String>();
			String finish="stop";
			
			
		switch(actCdm){
		case "Send":
			

				if(!word1.equalsIgnoreCase(finish)){
				String phrase=longestWord(word1);
				
				//arrLongWords[counter++];
				counter++;
                // appendValue(phrase);
				LongWords.add(phrase);
				
				
				String blah=message(phrase);
				lblNewLabel.setText(blah);
				
				appendToFile(fileName,word1);
				appendToFile(fileName,blah);
				conversation.add(word1);
				}else{
					
					lblNewLabel.setText("Bye! I hope you find the answer.\n Thank You! \nEliza");
					
			  }
			
		
				textField.setText("");
		
			break;
			
		case"See longest words":
			
			
			
			frmLongestwords.setVisible(true);
			
			//counter
			lblNewLabelA.setText(LongWords.toString()+" Long words:"+LongWords.size());
			
			break;
			
		case "File":
			
			frmFileDisplay.setVisible(true);
			String copy=readFile("Therapysession.txt");
			jta.setText("Whats on your mind today:"+copy);
			
			break;
			
		case "Clear file":
			
			createNewFile("Therapysession.txt");
			
			break;
		default:
			lblNewLabel.setText("that sucs");
		}
		}
		
	
}






		//lblNewLabel.setText(message(longestWord(word1)));
		
		
		
				//catch (Exception exc){
				//lblNewLabel.setText(exc.getMessage());
				//System.exit(0);
				//}
				
				
				
			//}

	/*
	 private ImageIcon image;
	 private JPanel jp;
	 private JPanel jp1;
	 private JLabel label;
	 private JLabel label1;
	 private JTextField textfield;
	 private JButton button;
	 private JButton button1;
	 private JButton button2;
	 private JTextArea area;
	 
	 
	 public ElizaGUI(){
		 
		 setLayout(new GridLayout());
		 label=new JLabel("im a label");
		 label1=new JLabel("in the other label",JLabel.CENTER);
		 textfield=new JTextField("what can i help ya");
	
		 
		 ////
		 area = new JTextArea(5, 20);
		// JScrollPane scrollPane = new JScrollPane(area); 
		 area.setEditable(false);
		 JScrollPane ScrollPane=new JScrollPane(area);
		 ///
		 
		 /////
		 
		////
		 button=new JButton("enter");
		 button1=new JButton("see longest words");
		 
		 button.addActionListener(this);
		 button1.addActionListener(this);
		 
		///// 
		 JPanel jp=new JPanel();
		 jp.setLayout(new FlowLayout());
		 jp.setBackground(Color.pink);
		 jp.add(label);
		 jp.add(textfield);
		 jp.add(button);
		 jp.add(button1);
		 jp.add(label1);
		 jp.add(ScrollPane);
		 
		 
		 //JPanel jp1=new JPanel();
		// jp1.setLayout(new FlowLayout());
		// jp1.setBackground(Color.cyan);
		// jp1.add(area);
		// jp1.add(ScrollPane);
		 
		// jp1.add(label);
		// jp1.add(label1);
		 
		// add(jp1);
		 
		 
	//	jp.add(label);
	//	jp.add(label1);
		 
		 
		// image=new ImageIcon(getClass().getResource("glasses.jpg"));
		// label=new JLabel(image);
		
		 
		 //jp=new JPanel();
		// jp.setBackground(Color.GREEN);
		// add(label);
		 
		 add(jp);
	 }
	
	 public static void main(String [] arg){
		 
		 ElizaGUI a= new ElizaGUI();
		 a.setTitle("Eliza Therapist");
		 a.setVisible(true);
		 a.setSize(400,400);
		 a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 ///
	
	
	
	//public void appendValue( String a) {
		  
		 // LongWords=new ArrayList<String>();
		  
	         // LongWords.add(a);
	      
	      //return LongWords.toString();
	 // }
	
	///
	
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	} }
	*/