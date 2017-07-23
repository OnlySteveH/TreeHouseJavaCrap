import java.util.Arrays;
import java.util.Date;

import com.teamtreehouse.Treet;
import com.teamtreehouse.Treets;

public class Example {

  public static void main(String[] args) {

    Treet treet =  new Treet(
    "craigsdennis",
    "Want to be famous? Simply tweet about Java and use the hashtag #treet. I'll use your tweet in a new @treehouse couse about data structures.",
    new Date(1421849732000L)
    );

    Treet secondTreet = new Treet(
    "journeytocode",
    "@treehouse makes learning Java soooo fun! #treet",
    new Date(1421878767000L)
    );

    System.out.printf("This is a new Treet: %s %n", treet);
    System.out.println("Words are: ");
    for (String word : treet.getWords()) {
      System.out.println(word);
    }

    Treet[] treets = {secondTreet, treet};
    Arrays.sort(treets);
    for (Treet exampleTreet : treets) {
      System.out.println(exampleTreet);
    }
    Treets.save(treets);
    Treet[] reloadedTreets = Treets.load();
    for (Treet reloaded : reloadedTreets) {
      System.out.println(reloaded);
    }

    Treet originalTreet = treets[0];
    System.out.println("Hashtags: ");
    for (String hashtag : originalTreet.getHashtags()) {
      System.out.println(hashtag);
    }

  }
}
