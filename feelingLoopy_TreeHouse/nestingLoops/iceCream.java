import java.io.Console;

public class iceCream {

  public static void main(String[] args) {
    Console console = System.console();
    String[] sweetFlavors = {"Caramel", "Cinnamon", "Watermelon",
                             "Baked Beans"};
    String[] savoryFlavors = {"Sea Salt", "Potato Chip", "Carrot",
                              "Barbaque Sauce"};

    for (String sweet : sweetFlavors) {
      for (String savory : savoryFlavors) {
        console.printf("%s and %s %n", sweet, savory);
      }
    }
  }
}
