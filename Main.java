import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner con = new Scanner(System.in);
		int t = con.nextInt();
		while(t-- > 0) {
			int x = 0;
			int y = 0;
			int n = con.nextInt();
			for(int i = 0; i < n; i++) {
				char a = con.next().charAt(0);
				char b = con.next().charAt(0);
				if((a == 'R') && (b == 'S')) x = x + 1;
				if((a == 'S') && (b == 'R')) y = y + 1;
				if((a == 'S') && (b == 'P')) x = x + 1;
				if((a == 'P') && (b == 'S')) y = y + 1;
				if((a == 'P') && (b == 'R')) x = x + 1;
				if((a == 'R') && (b == 'P')) y = y + 1;
			}
			if(x > y) {
				System.out.println("Player 1");
			}else if(x < y) {
				System.out.println("Player 2");
			}else {
				System.out.println("TIE");
			}
		}
	}
}
