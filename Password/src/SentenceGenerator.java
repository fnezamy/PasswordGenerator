import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SentenceGenerator extends Anaylsis {
	public String generate(){
		
		String operation = getOperation();
		
		String general = getGeneral();
		String thing = getThing();
		String[] s = {"!","@","#","$","%","^","&","*","(",")","?"};
		Random ran = new Random();
		int r = ran.nextInt(s.length);
		int p = ran.nextInt(s.length);
		thing = thing.replaceAll("\\s+","");
		operation = operation.replaceAll("\\s+","");
		operation = operation.toUpperCase();
		general = general.replaceAll("\\s+","");

		//System.out.print(thing+s[r]+operation+s[p]+general);
		return thing+s[r]+operation+s[p]+general;
}
	
	
	public static String getThing() {
		List<String>thing = new ArrayList<String>();
		File file = new File("thing.txt");
		try {
			Scanner sc = new Scanner(file);
			String word;
			sc.useDelimiter(", ");
			while(sc.hasNext()){
				word = sc.next();
				thing.add(word);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		Boolean t = true; 
		Random ran = new Random();
		int r =	ran.nextInt(thing.size());
		String test = new String();
		test = thing.get(r);
		
		return test;
		
	}

	private static String getGeneral() {
		List<String>general = new ArrayList<String>();
		File file = new File("general.txt");
		try {
			Scanner sc = new Scanner(file);
			String word;
			sc.useDelimiter(",");
			while(sc.hasNext()){
				word = sc.next();
				general.add(word);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		Boolean t = true; 
		Random ran = new Random();
		int r =	ran.nextInt(general.size());
		String test = new String();
		test = general.get(r);
		
		return test;
		
	}

	public static String getOperation() {
		List<String>operations = new ArrayList<String>();
		File file = new File("operations.txt");
		try {
			Scanner sc = new Scanner(file);
			String word;
			sc.useDelimiter(",");
			while(sc.hasNext()){
				word = sc.next();
				operations.add(word);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		Boolean t = true; 
		Random ran = new Random();
		int r =	ran.nextInt(operations.size());
		String test = new String();
		test = operations.get(r);
		
		return test;
	}
	public void print(String s){
		System.out.print("SentenceGenerated password is ");
    	super.printanaylsis(s);
    }
}



/*
 * List<String> dictionary = new ArrayList<String>();
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
 */
