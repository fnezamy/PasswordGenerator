import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UserGenerated extends Anaylsis {
	public String generate(String color, String year){
		/*
		String [] colors = {"red","yellow","blue","green","orange","black","white"};
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Select your favorite color : ");
		for(int i = 0;i<colors.length;i++){
			System.out.print(colors[i] + " ");
		}
		System.out.println();
		String userColor = sc.next();
		System.out.println("Enter the last two digits of your birth year :");
		int code = sc.nextInt();
		*/
		String eColor = encodedcolor(color);
	
		String pass = dictionary_creator();
		String sym = symbol();	
		
		//System.out.println(eColor+pass+sym+code);
	
		return eColor+pass+sym+year;
	
}
	
	public static String encodedcolor(String userColor) {
		switch(userColor){
			case "red" : return "r3D";
			case "blue" : return "b1U";
			case "yellow" : return "y3L";
			case "orange" : return "0rA";
			case "black" : return "b1A";
			case "white" : return "wH1";
			case "green" : return "6r3";
						
		}
		return null;
	}
	
	public static String dictionary_creator(){
		List<String> dictionary = new ArrayList<String>();
		BufferedReader br = null;
		try
		{
		  br = new BufferedReader(new FileReader("words.txt"));
		  String word;

		  while((word = br.readLine())!=null)
		  {
		      dictionary.add(word);
		      
		  }

		}
		catch(IOException e)
		{
		  e.printStackTrace();
		}
		Boolean t = true; 
		Random ran = new Random();
		int r =	ran.nextInt(dictionary.size());
		String test = new String();
		do{
			 test = dictionary.get(r);
			if(test.length()>5 && test.length()>3){
				r = ran.nextInt(dictionary.size());
			}else{
				t = false;
			}
		}while(t);
		
		return test;
		
	}
	public static String symbol(){
		String[] s = {"!","@","#","$","%","^","&","*","(",")","?"};
		Random ran = new Random();
		int r = ran.nextInt(s.length);
		return s[r];
	}
	public void print(String s){
		System.out.print("UserGenerated password is ");
    	super.printanaylsis(s);
    }
}



/*
 *a password generator that gets specific information from a user and generates a password based off of that information
 * 
 * ex : ask the user to select their favorite color, select a number from 1-100, and ask the user for maybe a word
 * 
 * so 
 * 
 * blue 112 hampton
 * 
 * 1b1UhaMp.5
 * 
 * red 112
 * 1r3d1.Teacher2
 * String fileName = sc.nextLine();

List<String> dictionary = new ArrayList<String>();

BufferedReader br = null;     

try
{
  br = new  BufferedReader(new FileReader(fileName));
  String word;

  while((word = br.readLine())!=null)
  {
      dictionary.add(word);
  }

}
catch(IOException e)
{
  e.printStackTrace();
}
String[] words = new String[dictionary.size()];
dictionary.toArray(words);

 * 
 * 
 */