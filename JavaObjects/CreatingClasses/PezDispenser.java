class PezDispenser {
  public static final int MAX_PEZ = 12;
  final private String characterName;
  private int pezCount;

  public PezDispenser(String characterName) {
    this.characterName = characterName;
    pezCount = 0;
  }

  public void fill() { // Use void when nothing is returned from the method.
    fill(MAX_PEZ);
  }

  public void fill(int pezAmmount) {
    int newAmmount = pezCount + pezAmmount;
    if (newAmmount > MAX_PEZ) {
      throw new IllegalArgumentException("Too many PEZ!!!!");
    }
    pezCount = newAmmount;
  }

  public boolean isEmpty() {
    return pezCount == 0;
  }

  public boolean dispense() {
    boolean wasDispensed = false;
    if (!isEmpty()) {
      pezCount--;
      wasDispensed = true;
    }
    return wasDispensed;
  }

  public String getCharacterName() {
    return characterName;
  }



/*
  public String swapHead(String characterName) {
    String originalCharacterName = this.characterName;
    this.characterName = characterName;
    return originalCharacterName;
  }
*/
}
