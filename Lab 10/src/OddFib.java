public class OddFib {
	
	
	
	public static long Fib(long in) {
		
		long out;
		
		if(in == 0) {
			return 0;
		}
		if(in == 1 || in ==2) {
			return 1;
		}else
			out = Fib(in-1) + Fib(in-2);
		
		return out;
	}
	
	public static long oddFib() {
		long oddSum = 0;
		long fibNum = 0;
		
		for(int i = 0; fibNum < 2000000000;i++)
		{		
			fibNum = Fib(i);
			if(fibNum % 2 == 1)
				oddSum += fibNum;
			
		}
		
		return oddSum;
	}
	
	
	public static void main(String[] args) {
		long oddSum = oddFib();
		System.out.println(oddSum);		
	}
}