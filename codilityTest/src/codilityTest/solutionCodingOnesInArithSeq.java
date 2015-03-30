package codilityTest;

public class solutionCodingOnesInArithSeq {
	public int solutionCodingOnesInArithSeq(int N){
		int count=0;
		System.out.println("i: ");
		for(int i=1;i<=N;i++){
			System.out.println(i);
			String numStr = Integer.toString(i);
			for (int j = 0; j < numStr.length(); j++) {
				if(numStr.charAt(j)=='1'){
					count++;
					//System.out.println("count: "+count);
				}
			}		
		}
		/*String numStr = Integer.toString(N);
	    for (int i = 0; i < numStr.length(); i++) {
	    	
	        System.out.println("digit: "  + numStr.charAt(i));
	    }*/
		return count;
	}
}
