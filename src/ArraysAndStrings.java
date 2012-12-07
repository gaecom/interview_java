public class ArraysAndStrings {

	public boolean stringHasAllUniqueCharacters(String string) {

		boolean[] s = new boolean[95];
		for (int i = 0; i < string.length(); i++) {
			if (s[string.charAt(i) - 32]) {
				return false;
			}
			s[string.charAt(i) - 32] = true;
		}
		return true;
	}

	public static void main(String[] arg) {
		System.out.println(new ArraysAndStrings().stringHasAllUniqueCharacters("alm"));
		System.out.println(new ArraysAndStrings().stringHasAllUniqueCharacters("aa"));
		System.out.println(new ArraysAndStrings().stringHasAllUniqueCharacters(""));
		System.out.println(new ArraysAndStrings().stringHasAllUniqueCharacters("alm"));
		System.out.println(new ArraysAndStrings().stringHasAllUniqueCharacters("almokrid[elrs"));
	}
	
	public boolean stringHasAllUniqueCharacters2(){
		
		
		return false;
	}
}
