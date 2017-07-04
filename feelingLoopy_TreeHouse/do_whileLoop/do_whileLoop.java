import java.io.Console;
import java.util.Random;

public class do_whileLoop {

  public static void main(String[] args) {
    Console console = System.console();
    Random luck = new Random();

    int numberOfPutts = 0;
    boolean ballInHole = false;

    do {
      console.printf("Putt putt %n");
      ballInHole = luck.nextBoolean();
      numberOfPutts++;
    } while (!ballInHole);

    console.printf("You got it in %d putts %n", numberOfPutts);

  }
}
