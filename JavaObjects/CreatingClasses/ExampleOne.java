public class ExampleOne {

  public static void main(String[] args) {
    System.out.println("We are making a new PEZ Dispenser");
    PezDispenser dispenser = new PezDispenser();
    dispenser.characterName = "Darth Vader"; // edited aftewards for practice.
    System.out.printf("The dispenser is %s %n", dispenser.characterName);
  }
}
