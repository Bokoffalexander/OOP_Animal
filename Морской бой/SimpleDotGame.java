import java.util.Scanner;

public class SimpleDotGame {
	public static void main(String[] args) {
		System.out.println(" GAME NAVY battle 0-6\n");
		Game game = new Game();
		game.start();

	}
}

class Site {
	int[] aims = {2, 3, 4};
	int restAims = 3;

	public boolean checkGuess(int guess) {
		for (int k = 0; k < this.aims.length; k++) {
			if (guess == this.aims[k])  {
				this.aims[k] = -1;
				this.restAims--;
				return true;
			}
		}
		return false;
	}

	public void print(boolean yes) {
		if (yes) {
			System.out.println(" YES");
		} else {
			System.out.println(" NO");
		}
	}

	public boolean killed() {
		if (restAims > 0) {
			System.out.println(" Still alive: " + this.restAims);
			System.out.println();
			return false;
		} else {
			System.out.println(" Killed!");
			return true;
		}
	}


}


class Game {
	int guess = -1;
	boolean yes = false;
	boolean end = false;
	int rate = 0;
	String name = "none";
	Site site = new Site();

	public void start() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Enter a name:");
		name = scanner.nextLine();
		System.out.println();

		while (true) {
			System.out.print(" Enter a number 0-6:");

			this.guess = scanner.nextInt();
			this.rate++;

			this.yes = site.checkGuess(this.guess);
			site.print(this.yes);
			end = site.killed();

			if (end) break;

		}
		System.out.println(" made " + this.rate + " tries");
	}


}
