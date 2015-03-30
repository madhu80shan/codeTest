package codilityTest;

public class solution {
	public boolean solution (int[] A, int K) {
		int n = A.length;
		int s = 0;
		/*for (int i = 0; i <= n - 1; i++) {
			if (A[i] + 1 < A[i + 1])
				return false;
			}
		if (A[0] != 1 && A[n - 1] != K)
			return false;
		else
			return true;*/
		for (int i = 0; i <= n - 1; i++) {
			if(A[i]==K)
				s=A[i];
		}
		if(s==K)
				return true;
		else 
			return false;
		
	}

}
