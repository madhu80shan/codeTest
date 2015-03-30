package codilityTest;

public class BugfixingConsecutiveIntegers {

	public static void main(String[] args) {
		int[] A = {1,200,450,5,900,10000,350,9};
		int K = 10000;
		//solution Solution;
		solution Solution = new solution();// solution(A, K);
		boolean s = Solution.solution(A, K);
		System.out.println("Output is "+s);
	
	}
	
	

}
