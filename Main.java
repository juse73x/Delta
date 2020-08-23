import java.util.*;
import java.io.*;
class Main {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
    int score = 0;
    while (true) {
      Random r = new Random();
      int randomInt = r.nextInt(1000) + 1;
      int randomadd = r.nextInt(1000) + 1;
      int d = randomInt + randomadd;
      int c = randomInt - randomadd;
      int x = r.nextInt(2);
      if (x == 0) {
        System.out.println("What is " + randomInt + " + " + randomadd + "?");
        int n = readInt();
        if (n == d) {
          System.out.println("Correct!");
          score += 1;
        }
        else {
          System.out.println("Incorrect");
          break;
        }
      }
      else {
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
    }
    System.out.println("Final Score: " + score);
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