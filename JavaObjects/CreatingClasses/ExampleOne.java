public class ExampleOne {

  public static void main(String[] args) {
    System.out.println("We are making a new PEZ Dispenser");
    PezDispenser dispenser = new PezDispenser("Yoda");
    System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
    /*
    String before =  dispenser.swapHead("Darth Vader");
    System.out.printf("It was %s but Chris switched it to %s %n", before, dispenser.getCharacterName());
    */
  }
}
