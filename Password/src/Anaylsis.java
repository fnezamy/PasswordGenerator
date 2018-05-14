import java.text.DecimalFormat;

import me.gosimple.nbvcxz.Nbvcxz;
import me.gosimple.nbvcxz.scoring.Result;
import me.gosimple.nbvcxz.scoring.TimeEstimate;

public class Anaylsis {
	Nbvcxz nbvcxz = new Nbvcxz();
	
	public String printanaylsis(String s){
		Result r = nbvcxz.estimate(s);
		//System.out.println(s);
		Result result = nbvcxz.estimate(s);
		//System.out.println("Entropy is : " + result.getEntropy());
		String timeToCrackOff = TimeEstimate.getTimeToCrackFormatted(r, "OFFLINE_BCRYPT_12");
		String timeToCrackOn = TimeEstimate.getTimeToCrackFormatted(r, "ONLINE_THROTTLED");
		//System.out.println(timeToCrackOff);
		//System.out.println(timeToCrackOn);
		//System.out.println();
		DecimalFormat df = new DecimalFormat("#.##");
		return "Entropy is : "+ df.format(result.getEntropy())+'\n'+timeToCrackOff+'\n'+timeToCrackOn;
	}
	
	public void bestpass(String myGenerated, String pwdGenerated, String wordGenerated, String u, String sentanceg){
		
		Result myGen = nbvcxz.estimate(myGenerated);
		Result pwdGen = nbvcxz.estimate(pwdGenerated);
		Result wordGen = nbvcxz.estimate(wordGenerated);
		Result userGen = nbvcxz.estimate(u);
		Result sentanceGen = nbvcxz.estimate(sentanceg);
		//comparing doubles is bad practice
		if(myGen.getEntropy()>pwdGen.getEntropy() && myGen.getEntropy()>wordGen.getEntropy() && myGen.getEntropy()>userGen.getEntropy()){
			System.out.println("My generated password has the highest entropy");
		}
		else if(pwdGen.getEntropy()>myGen.getEntropy() && pwdGen.getEntropy()>wordGen.getEntropy() && pwdGen.getEntropy()>userGen.getEntropy()){
			System.out.println("Pwd generated password has the highest entropy");
		}
		else if(wordGen.getEntropy()>userGen.getEntropy()){
			System.out.println("Word generated password has the highest entropy");
		}
		else if(userGen.getEntropy()>sentanceGen.getEntropy()){
			System.out.println("User Generated password has the highest entropy");
		}
		else{
			System.out.println("Sentance generated password has the highest entropy");
		}
	}
	
	
}
