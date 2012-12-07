
public class Palyndrom {

	public static boolean check(String inputString) {
		int halfLengthOfInputString = 0;
		int inputLength = inputString.length();
		boolean isPalyndrom = true;
		
		if(inputLength == 0 || inputLength == 1){ return false;}
		
		if(inputLength % 2 != 0){
			halfLengthOfInputString = (inputLength/2)+1;
		}else{
			halfLengthOfInputString = (inputLength/2);
		}
		
		for(int j = 0; j < halfLengthOfInputString; j++){
			if(inputString.charAt(j) != inputString.charAt(--inputLength)){
				isPalyndrom = false;
			}
		}
		return isPalyndrom;
	}
	
	public static boolean palindrome(String inputString){
		boolean isPalyndrom = true;
		int inputLength = inputString.length();
		for(int j = 0; j < inputString.length(); j++,--inputLength){
			if(inputString.charAt(j) != inputString.charAt(inputLength)){
				isPalyndrom = false;
			}
		}
		return isPalyndrom;
	}
}
