package codilityTest;

public class CodingSimilarIntegerCount {
	//int N = 1231;
	public static void CodingSimilarIntegerCount(int N) {
        int[] p   = new int[N];     // permutation
        int[] pi  = new int[N];     // inverse permutation
        int[] dir = new int[N];     // direction = +1 or -1
        for (int i = 0; i < N; i++) {
            dir[i] = -1;
            p[i]  = i;
            pi[i] = i;
        }
        CodingSimilarIntegerCount(0, p, pi, dir);
        System.out.printf("   (0 1)\n");
    }

    public static void CodingSimilarIntegerCount(int N, int[] p, int[] pi, int[] dir) { 

        // base case - print out permutation
        if (N >= p.length) {
            for (int i = 0; i < p.length; i++)
                System.out.print(p[i]);
            return;
        }

        CodingSimilarIntegerCount(N+1, p, pi, dir);
        for (int i = 0; i <= N-1; i++) {

            // swap 
            System.out.printf("   (%d %d)\n", pi[N], pi[N] + dir[N]);
            int z = p[pi[N] + dir[N]];
            p[pi[N]] = z;
            p[pi[N] + dir[N]] = N;
            pi[z] = pi[N];
            pi[N] = pi[N] + dir[N];  

            CodingSimilarIntegerCount(N+1, p, pi, dir); 
        }
        dir[N] = -dir[N];
    }
    public static void main(String[] args) {
        int N = 4;//Integer.parseInt(args[0]);
        CodingSimilarIntegerCount(N);
    }

}
