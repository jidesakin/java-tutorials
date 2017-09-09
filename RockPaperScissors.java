import java.util.Scanner;
class RockPaperScissors {

  public static void main(String[] args) {
    String player1;
    String player2;
    RockPaperScissors r = new RockPaperScissors();
    Scanner sc = new Scanner(System.in);
    System.out.println("Player 1, please enter your move!");
    player1 = sc.nextLine();
    System.out.println("Player 2, please enter your move!");
    player2 = sc.nextLine();
    
    r.play(player1, player2);
  }

  public void play(String player1, String player2) {
    System.out.println("Player 1's Move: " + player1);
    System.out.println("Player 2's Move: " + player2);

    if (player1.equals("rock") && player2.equals("scissors")) {
      System.out.println("Player 1 wins!");
    } else if (player1.equals("scissors") && player2.equals("rock")) {
      System.out.println("Player 2 wins!");
    } else if (player1.equals("paper") && player2.equals("rock")) {
      System.out.println("Player 1 wins!");
    } else if (player1.equals("rock") && player2.equals("paper")) {
      System.out.println("Player 2 wins!");
    } else if (player1.equals("scissors") && player2.equals("paper")) {
      System.out.println("Player 1 wins!");
    } else if (player1.equals("paper") && player2.equals("scissors")) {
      System.out.println("Player 2 wins!");
    } else if (player1.equals(player2)) {
      System.out.println("It's a draw!");
    } else {
      System.out.println("Error!");
    }

  }
}