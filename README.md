# Project-Eliza-Spring
<h3>PORJECT ELIZA SPRING MIDTERM 2017</h3>

In 1996 there was a program named <b>ELIZA</b>.It parodied a psychotherapist session, such that the user would type sentences and the program used those words to compose a question. Your project will be similar in concept.
Hints: You will need to know how to work with Strings, Arrays, File I/O, Exceptions, GUI


<h3> The GUI</h3>

Create a JFrame with a JPanel containing the following components.
   jlabel for displaying the program questions
   jtextfield for the user's response to be typed
   jbutton to allow the user to submit the answer
   jlabel for displaying all the (longestWords) he/she used in this session
   jbutton for the user to request all (longestWords) used in this session 
   Note: When displaying in the jlabel separate all the longestWords by commas.
   
<h3>Instructions<h3>

The initial label text should say "Tell me what is on your mind today in 1 sentence.”
When the user submits their sentence your program should find the longest word in the sentence.
It should store the longest word in the next slot in a String array of words.
It should also write the entire sentence to a file so that after the program completes, all sentences are in the file.
It should respond to the user with one of the 5 comments listed below.
When the program completes do the following:
Display all the “longest” words from the array.
Tell the user the name of the file containing all the sentences.
Read the file into a TextArea and display its contents in the GUI - ExtraCredit* 

<h3>Comments to display<h3>

Comments to display to user depending on length of the longest word in their sentence:
1. If the length of the longest word is 3 characters long your response should be "Why do you feel longestWord  is important?"

2. If the length of the longest word is 4 characters long your response should be "OK tell me more about longestWord"

3. If the length of the longest word is 5 characters long your response should be "How does longestWord affect you?"

4. If the length of the longest word is more than 5 characters long your response should be "We seem to be making great progress with longestWord"

5. If the length of the longest word is less than 3 characters long your response should be "Is there something else you would like to discuss?"

<h3>Result<h3>













