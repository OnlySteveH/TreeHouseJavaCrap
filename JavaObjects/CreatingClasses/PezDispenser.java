class PezDispenser {
  public static final int MAX_PEZ = 12;
  final private String characterName;
  private int pezCount;

  public PezDispenser(String characterName) {
    this.characterName = characterName;
    pezCount = 0;
  }

  public void fill() { // Use void when nothing is returned from the method.
    pezCount = MAX_PEZ;
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
