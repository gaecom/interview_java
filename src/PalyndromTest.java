import junit.framework.Assert;

import org.junit.Test;


public class PalyndromTest {

	@Test
	public void returnsFalse_when_oneElement(){
		String inputString = "a";
		Assert.assertFalse(Palyndrom.check(inputString));
	}
	
	@Test
	public void returnsFalse_when_noElement(){
		String inputString = "";
		Assert.assertFalse(Palyndrom.check(inputString));
	}
	
	
	@Test
	public void returnsFalse_when_notTheSameElements(){
		String inputString = "ab";
		Assert.assertFalse(Palyndrom.palindrome(inputString));
	}

	@Test
	public void returnsFalse_when_notTheSameElements_2(){
		String inputString = "bbab";
		Assert.assertFalse(Palyndrom.palindrome(inputString));
	}
	
	@Test
	public void returnsTrue_when_palyndromButLengthIsOdd(){
		String inputString = "aba";
		Assert.assertTrue(Palyndrom.palindrome(inputString));
	}
	
	@Test
	public void returnsTrue_when_palyndromButLengthIsEven(){
		String inputString = "aaabbaaa";
		Assert.assertTrue(Palyndrom.palindrome(inputString));
	}
	@Test
	public void returnsTrue_when_palyndromButLengthIsOdd_2(){
		String inputString = "aaabbbaaa";
		Assert.assertTrue(Palyndrom.palindrome(inputString));
	}
	
}
