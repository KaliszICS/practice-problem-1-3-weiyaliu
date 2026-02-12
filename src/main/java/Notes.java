/**
* File Name: Lesson 1.3 - Strings
* Author: Mr. Kalisz
* Date Created: Feb 8, 2023
* Date Last Modified: Feb 12, 2026
*/

class Notes  {
	public static void main(String args[]) {
 
		// Documentation/multi line comments

		/*
			This is a multi line comment
			HEre is a comment
			This is a comment too
			And this
			And this
		*/ 
		// The "*/" ended the multi comment

		/**
		  * These are documentation
		  *
		  *
		  */
		
		//Output

		
		// print - does not add a new line after the output

		System.out.println("Hello World"); //println adds a new line after the output
		System.out.print("Hello World"); //print does not
		System.out.println("I'm on the same line"); //same line since the previous print did not add a new line
		
		// newline character - "\n"
		
		//must be used inside quotation marks otherwise the new line character does nothing and crashes
		// System.out.println("Hello" \n);
		System.out.println("Hello\n\n\n\nWorld"); 

		
		// Strings
		
		String word; //String has a capital S, not lowercase
		word = "Hello";
		
		System.out.println(word);
		System.out.println("word");
		
		//concatenation - combining strings
		
		String word2;
		word2 = "Help Me";
		
		String word3;
		word3 = word + word2; //has no space between them
		System.out.println(word3);
		
		word3 = word + " " + word2; //has no space between them
		System.out.println(word3); //add a space concatenated inbetween the two variables to separate them.
		
		word2 = word2 + "."; //Similar to integers we can append(add to the end) to the Strings
		System.out.println(word2);
		
		System.out.println("a" + "\n" + "b"); 

		//Concatenation is done when adding strings with other data types
		System.out.println(word2 + 5 + 4);
	}
}
