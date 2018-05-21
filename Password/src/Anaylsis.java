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
	
	public String Entropy(String s){
		Result r = nbvcxz.estimate(s);
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(r.getEntropy());
	}
	
	public String Crack1(String s){
		Result r = nbvcxz.estimate(s);
		return TimeEstimate.getTimeToCrackFormatted(r,"OFFLINE_BCRYPT_12");
	}
	
	public String Crack2(String s){
		Result r = nbvcxz.estimate(s);
		return TimeEstimate.getTimeToCrackFormatted(r, "ONLINE_THROTTLED");
	}
	
	
	public String bestpass(String myGenerated, String pwdGenerated, String wordGenerated, String u, String sentanceg){
		
		Result myGen = nbvcxz.estimate(myGenerated);
		Result pwdGen = nbvcxz.estimate(pwdGenerated);
		Result wordGen = nbvcxz.estimate(wordGenerated);
		Result userGen = nbvcxz.estimate(u);
		Result sentanceGen = nbvcxz.estimate(sentanceg);
		//comparing doubles is bad practice
		if(myGen.getEntropy()>pwdGen.getEntropy() && myGen.getEntropy()>wordGen.getEntropy() && myGen.getEntropy()>userGen.getEntropy()){
			return "My generated password has the highest entropy";
		}
		else if(pwdGen.getEntropy()>myGen.getEntropy() && pwdGen.getEntropy()>wordGen.getEntropy() && pwdGen.getEntropy()>userGen.getEntropy()){
			return "Pwd generated password has the highest entropy";
		}
		else if(wordGen.getEntropy()>userGen.getEntropy()){
			return "Word generated password has the highest entropy";
		}
		else if(userGen.getEntropy()>sentanceGen.getEntropy()){
			return "User Generated password has the highest entropy";
		}
		else{
			return "Sentance generated password has the highest entropy";
		}
	}
	
	
}
