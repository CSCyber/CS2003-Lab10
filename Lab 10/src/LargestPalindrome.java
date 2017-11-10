
public class LargestPalindrome {


	
	public static boolean isPalindrome(String s) {
		
		int length = s.length();
		if(length %2 == 0) {
			for(int f = 0, b = length-1;f < b;f++,b--) {
				if(s.charAt(f) == s.charAt(b)) {
					continue;
				}else {
					return false;
				}
			}
		}else {
			for(int f = 0, b = length-1;f <= b;f++,b--) {
				if(s.charAt(f) == s.charAt(b)) {
					continue;
				}else {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int largestPalin = 0;
		int currentInt= 0;
		
		for(int x = 1000; x <= 9999; x++) {
			for(int y = 1000; y < 9999; y++) {
				
				currentInt = x*y;
				
				if(isPalindrome(Integer.toString(currentInt))){
					if(currentInt > largestPalin) {
						largestPalin = currentInt;
					}
				}
			}
		}
		
		System.out.println(largestPalin);
		
	}
	
	
}
