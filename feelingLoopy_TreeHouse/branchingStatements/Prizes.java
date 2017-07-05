import java.io.Console;

public class Prizes {

  public static void main(String[] args) {
    Console console = System.console();
    String[] rsvps = Rsvps.shuffled(); // Empty array, therefore this code doesnt work until you add elements into it.
    int prizesGivenAway = 0;
    int drawingNumber = 0;

    while (prizesGivenAway < 5) {
      String winner = rsvps[drawingNumber];
      drawingNumber++;
      console.printf("Is %s present? ", winner);
      String isHere = console.readLine();
      if (isHere.equalsIgnoreCase("no")) {
        continue;
      }
      String size = console.readLine("what is your shirt size? ");
      prizesGivenAway++;
    }
  }
}
