import java.util.Random;

public class MyGenerator extends Anaylsis {
	
	String pass;
	public String generate(int i){
		StringBuilder password = new StringBuilder();
		final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*";
		final int N = alphabet.length();
		Random r = new Random();
		
		for(int j = 0;j<i;j++){
			password.append(alphabet.charAt(r.nextInt(N)));
		}
		
		
		pass = password.toString();
		return pass;
				
	}
	public void print(String s){
		System.out.print("MyGenerated password is ");
    	super.printanaylsis(s);
    }
	
	
	

}
