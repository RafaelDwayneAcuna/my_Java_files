package stacktraining;

public class dwayneLsearch {
	
	public static void main(String[] args) {
		
		int[] array = {69, 420, 72, 98 ,47};
		
		int index = linearsearch(array, 69);
		
		if (index == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("element found");
		}
	}
	
	private static int linearsearch (int[] array, int value) {
		
		for(int i = 0; i < array.length; i++ ) {
			if(array[i] == value) {
				
				return i;
			}
		}
		return -1;
	}

}
