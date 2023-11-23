import java.lang.Math;

class Game{
	Player player1 = new Player();
	Player player2 = new Player();
	Player player3 = new Player();

	public void startGame(){
		System.out.println("Game is started !");

		int guess_player1 = 0;
		int guess_player2 = 0;
		int guess_player3 = 0;

		boolean player1_is_right = false;
		boolean player2_is_right = false;
		boolean player3_is_right = false;

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Real number is from 0 to 9 ");

		while(true){
			System.out.println("Ok.Target number is " + targetNumber);

			player1.guess();
			player2.guess();
			player3.guess();

			guess_player1 = player1.number;
			guess_player2 = player2.number;
			guess_player3 = player3.number;

			System.out.println("Player_1 thinks it is " + guess_player1);
			System.out.println("Player_2 thinks it is " + guess_player2);
			System.out.println("Player_3 thinks it is " + guess_player3);

			if (guess_player1 == targetNumber) {
				player1_is_right = true;
			}
			if (guess_player2 == targetNumber) {
				player2_is_right = true;
			}
			if (guess_player3 == targetNumber) {
				player3_is_right = true;
			}

			if (player1_is_right || player2_is_right || player3_is_right) {
				System.out.println("There is a winner!");
				System.out.println("Player_1: Did he guess? " + player1_is_right);
				System.out.println("Player_2: Did he guess? " + player2_is_right);
				System.out.println("Player_3: Did he guess? " + player3_is_right);
				System.out.println("END of the game!");
				break;
			} else {
				System.out.println("Players should try again!");
			}

		}
		
		
	}
}

class Player {
	int number = 0; // Это вариант числа
	public void guess(){ // Попытка угадать
		number = (int) (Math.random() * 10);
		System.out.println("I think it is " + number);
	}
}

public class Main{
	public static void main(String[] args){

		System.out.println("Guess - game");
		Game game = new Game();
		game.startGame();
	}
}
