// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	   int N = Integer.parseInt(args[0]);
        String mode = args[1];
        
        boolean isVerbose = mode.equals("v");

        for (int seed = 1; seed <= N; seed++) {
            
            int currentNum = seed;
            int steps = 1; 

            if (isVerbose) {
                System.out.print(currentNum);
            }

            while (currentNum != 1) {
                
                if (currentNum % 2 == 0) {
                    currentNum = currentNum / 2;
                } 
				else {
                    currentNum = currentNum * 3 + 1;
                }
                
                steps++;

                if (isVerbose) {
                    System.out.print(" " + currentNum);
                }
            }

            if (isVerbose) {
                System.out.println(" (" + steps + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    
	}
}
