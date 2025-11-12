//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String text = args[0];
        int n = Integer.parseInt(args[1]);
        
        text = text.toUpperCase();
        
        String anLetters = "AEFHILMNORSX";
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if (anLetters.indexOf(ch) != -1) {
                System.out.println("Give me an " + ch + ": " + ch + "!");
            } else {
                System.out.println("Give me a " + ch + ": " + ch + "!");
            }
        }
        
        System.out.println("What does that spell?");
        
        for (int i = 0; i < n; i++) {
            System.out.println(text + "!!!");
        }
    }
}