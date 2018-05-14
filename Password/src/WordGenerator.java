import me.gosimple.nbvcxz.resources.Generator;
public class WordGenerator extends Anaylsis {
	String generate(int i){
		String s = Generator.generatePassphrase("", i);
		return s;
	}
	public void print(String s){
		System.out.print("WordGenerater password is ");
    	super.printanaylsis(s);
    }

}
