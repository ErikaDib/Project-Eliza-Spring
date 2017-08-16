package ElizaPack;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class ElizaDrive extends Eliza{

	public static void main(String[] args) {
		
		String fileName="Therapysession.txt";
		PrintWriter outputStream=null;
		try{
			outputStream=new PrintWriter(fileName);
		}
		catch(FileNotFoundException e){
			System.out.println("error opening the file"+ fileName);
			System.exit(0);
		}
		
		System.out.println("Whats on your mind today?");
		Scanner keyboard = new Scanner(System.in);
		outputStream.println("1.Whats on your mind today?");
		
		//for(int count=1;count>0;count++){
		  ArrayList<String>LongWords=new ArrayList<String>();
		  int count=1;
		  while(count>0) { 
			  //error when empty
			
			String line=keyboard.nextLine();
			String finish="bye";
			if(!line.equalsIgnoreCase(finish)){
			String phrase=longestWord(line);
			//
			LongWords.add(phrase);
			//
			String blah=message(phrase);
			System.out.println(blah);
			outputStream.println((count)+"."+" User: " + " "+ line);
			outputStream.println((count+1)+"."+" Eliza: " + " "+ blah);
			count++;
			}else{
				outputStream.println(count+"User:"+finish);
				outputStream.println((count+1)+"Eliza:"+"Bye! I hope you find the answer.\n Thank You!\nEliza");
				System.out.print("Bye! I hope you find the answer.\n Thank You!\nEliza");
				outputStream.close();
				System.out.println("\nThis conversation was written to "+ fileName);
				for(String value:LongWords){
					System.out.println(value);
			}
		}
			
			
	}
		 
		outputStream.close();
		System.out.println("\nThis conversation was written to "+ fileName);
		 for(String value:LongWords){
				System.out.println(value);
		}
		
		}
}
		//System.out.println("Whats on your mind today?");
		//Scanner keyboard = new Scanner (System.in);
		
		//String userImput=keyboard.nextLine();
		//Eliza y=new Eliza();
		//String word1=y.longestWord(userImput);
		//String mess=y.message(word1);
		//System.out.print(mess);
		
	//	String bye="bye";
		//while(true){
		//	for(int i=1;i<=20;i++){
			//	String user=keyboard.nextLine();
			//	outputStream.println(i+user);
			//	System.out.println(i+user);
				//String word2=y.longestWord(user);
			//	String mess1=y.message(word2);
				//System.out.println(mess1);
			//	outputStream.println(i+mess1);
				
			
		/*
			String user=keyboard.nextLine();
			String word2=y.longestWord(user);
			String mess1=y.message(word2);
			System.out.println(mess1);
			outputStream.println(mess1+user);
			*/
        //   outputStream.close();
           
//System.out.println("Whats on your mind today?");
		//Scanner keyboard = new Scanner (System.in);
		//String userImput=keyboard.nextLine();
	//System.out.print("hola");
	//	Eliza y=new Eliza();
	//	String word1=y.longestWord(userImput);
	//	System.out.print(h);
		//String mess=y.message(word1);
	//	System.out.print(mess);
		//String bye="bye";
			
			
		
		//}
//}


	
