import java.util.*;
import java.io.*;
class Main {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // used in replacement for scanner
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
    System.out.println("Addition and Subtraction Quiz: "); // title
    int score = 0; // score
    while (true) {
      Random r = new Random(); // intialize random
      int randomInt = r.nextInt(2000) - 999; // create random number
      int randomadd = r.nextInt(1000) + 1;
      int d = randomInt + randomadd; // store sum
      int c = randomInt - randomadd; // store difference
      int x = r.nextInt(2); // create addition or subtraction
      if (x == 0) { // addition
        System.out.println("What is " + randomInt + " + " + randomadd + "?");
        int n = readInt(); // input
        if (n == d) { // check if correct
          System.out.println("Correct!");
          score += 1; // add score
        }
        else {
          System.out.println("Incorrect");
          break; // leave if incorrect
        }
      }
      else { // subtraction
        System.out.println("What is " + randomInt + " - " + randomadd + "?");
        int n = readInt();
        if (n == c) {
          System.out.println("Correct!");
          score += 1;
        }
        else {
          System.out.println("Incorrect");
          break;
        }
      }
      System.out.println("+----------------------------------+");
    }
    System.out.println("Final Score: " + score); // output score
	}
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) 
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong() throws IOException {
		return Long.parseLong(next());
	}
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter() throws IOException {
		return next().charAt(0);
	}
	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}