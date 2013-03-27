package careercup.bloomberg;

public class CareerCup_16171686 {

	/***
	 * if more than 2 numbers missing from 10
	 */
	public static void main(String[] args) {
		int[] array = new int[]{1,3,5,8,7,10,4,6,9};
		boolean[] elementsArray = new boolean[11];
		for (int i = 0; i < array.length; i++) {
			elementsArray[array[i]] = true;
		}
		for (int i = 1; i < elementsArray.length; i++) {
			if(elementsArray[i]==false) System.out.println(i);
		}
		
		/***
		 * if 1 number missing from the 10
		 */
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		int sumOfNumbers = 0;
		for (int i = 0; i < array.length; i++) {
			sumOfNumbers += array[i];
		}
	}

}
