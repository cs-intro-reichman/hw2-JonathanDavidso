// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	int numberOfTerms = Integer.parseInt(args[0]);
	double sum = 0.0;
    double sign = 1.0;
		for (int i = 0; i < numberOfTerms; i++) {
			double denominator = (2 * i) + 1;
            sum = sum + sign * (1.0 / denominator);
			sign = -sign;
        }
	double approxPi = sum * 4;
		
	System.out.println("pi according to Java: " + Math.PI);
    System.out.println("pi, approximated: " + approxPi);
    }
}


