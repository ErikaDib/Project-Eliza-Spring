package ElizaPack;

import java.awt.FlowLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextFileInputDemo extends JFrame {
	
	
	JTextArea jta;
	JScrollPane jsp;
	
	public TextFileInputDemo(){
		   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextFileInputDemo window3=new TextFileInputDemo();
		window3.setVisible(false);
		
		String fileName="Therapysession.txt";
		Scanner inputStream=null;
		System.out.println("the file"+fileName+"\ncontains the following conversation:");
		try{
			inputStream=new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e){
			//System.out.println(" error opening the file"+fileName);
			System.exit(0);
		}
		while(inputStream.hasNextLine()){
			String line=inputStream.nextLine();
			
			//System.out.println(line);
		}

		inputStream.close();
		
		
		
	}

}
