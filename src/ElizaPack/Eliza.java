package ElizaPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Eliza {
         
/*
        1. If the length of the longest word is 3 characters long your response should be "Why do you feel longestWord  is important?"

        2. If the length of the longest word is 4 characters long your response should be "OK tell me more about longestWord"

        3. If the length of the longest word is 5 characters long your response should be "How does longestWord affect you?"

        4. If the length of the longest word is more than 5 characters long your response should be "We seem to be making great progress with longestWord"

        5. If the length of the longest word is less than 3 characters long your response should be "Is there something else you would like to discuss?"

*/
  public static String  longestWord (String s){
	  
        String splitted=s;
        String[]arr=splitted.split(" ");
       // System.out.println(arr.length);
        int longest=0;
        String longestword=null;
        for(int i =0;i<arr.length;i++){
        	if(arr[i].length()>longest){
        		longest=arr[i].length();
        		longestword=arr[i];
        	}
        	//System.out.println(arr[i]);
        	
        }
        
    return longestword;
        
  }
  
  public void createNewFile(String fileName) {
		PrintWriter outStream = null;//notice this is not inside the try block	
		try {
			outStream = new PrintWriter(fileName);//create a new file
		}catch (FileNotFoundException e) {
			//System.err.println("Could not create the file "+fileName+ " MESSAGE: "+e.getMessage());
		}
		finally{
			if(outStream != null){
				outStream.close();
			}
		}
		//System.out.println("DONE CREATING NEW FILE"+fileName);
	}
    
  
  public static String message (String longestword){
	  String message= "Is there something else you would like to discuss?";
	  int lengthOfword=longestword.length();
	  if(lengthOfword==3){
		  message="Why do you feel "+longestword +" is important";
		  return message;
	  }
		  
		  if(lengthOfword==4){
			  message="OK tell me more about "+ longestword;
			  return message;
		  }
			  
			  if(lengthOfword==5){
				  message="How does "+ longestword+" affect you?";
				  return message;
			  }
				  
				  if(lengthOfword>5){
					  message="We seem to be making great progress with "+ longestword;
					  return message;
				  }
				  
			  
			
	  return message;
  }
  public boolean deleteFile(String fileName) {
		File fileObj = new File(fileName);
		if(fileObj.exists()){
			if(fileObj.delete()){
				System.out.println("The file "+ fileObj.getAbsolutePath() + " was deleted successfully");
				return true;//indicate success
			}
			else{
				System.err.println("The file "+ fileObj.getAbsolutePath() + "failed to be deleted");
				return false;
			}
		}
		else{
			System.err.println("The file named "+ fileObj.getName() +
					" with path= "+fileObj.getAbsolutePath()+ " could not be deleted");
			return false;
		}
	}

  
  public void writeToNewFile(String fileName, String text) {
		PrintWriter outStream = null;
		try{
			outStream = new PrintWriter(fileName);//create a new file
			outStream.println(text);//write to the new file
		}catch(FileNotFoundException e){
			System.err.println("Could not create the file "+fileName+ " MESSAGE: "+e.getMessage());
		}
		finally{//do clean up
			if(outStream != null){
				outStream.close();
			}
		}
		//System.out.println("DONE CREATING new file and writing to it "+fileName);
		
	}
  
  public void appendToFile(String fileName, String text) {
		PrintWriter outStream = null;
		try{
			outStream = new PrintWriter(new FileOutputStream(fileName, true));//true tells computer we want to keep previous content
			outStream.println(text);//append to the file
		}catch(FileNotFoundException e){
			System.err.println("Could not append to the file "+fileName+ " MESSAGE: "+e.getMessage());
		}
		finally{//do clean up
			if(outStream != null){
				outStream.close();
			}
		}
		
	}

   public void WhatsOnFile(String fileName){
   
  // TextFileInputDemo window3=new TextFileInputDemo();
	//window3.setVisible(false);
	
	//String fileName="Therapysession.txt";
	Scanner inputStream=null;
	//System.out.println("the file"+fileName+"\ncontains the following conversation:");
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
   
   
   public String readFile(String fileName) {
		Scanner inStream = null;
		String fileContents = "";
		try {
			
			inStream = new Scanner( new File ( fileName ));
			while(inStream.hasNextLine()){//get all lines and append to string
				fileContents += inStream.nextLine() +"\n";//read 1 line from file and append it to fileContents
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			if(inStream != null){
				inStream.close();
			}
		}
		
		return fileContents;
	}
   
   public void clearFile(String fileName,String newText){
	   
	   
	   
   }
  
}  
	  
