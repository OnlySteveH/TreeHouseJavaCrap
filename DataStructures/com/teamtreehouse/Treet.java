package com.teamtreehouse;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Treet implements Comparable<Treet>, Serializable {
  private static final long serialVersionUID = 7146681148113043748L;
//  private boolean mBreakIt = true;
  private String mAuthor;
  private String mDescription;
  private Date mCreationDate;

  public Treet(String author, String description, Date creationdate) {
    mAuthor = author;
    mDescription = description;
    mCreationDate = creationdate;
  }

  @Override
  public String toString() {
    return String.format("Treet:  \"%s\" by %s on %s", mDescription, mAuthor, mCreationDate);
  }

  @Override
  public int compareTo(Treet other) {
    if (equals(other)) {
      return 0;
    }
    int dateCmp = mCreationDate.compareTo(other.mCreationDate);
    if (dateCmp == 0) {
      return mDescription.compareTo(other.mDescription);
    }
    return dateCmp;
  }

  public String getAuthor() {
    return mAuthor;
  }

  public String getDescription() {
    return mDescription;
  }

  public Date getCreationDate() {
    return mCreationDate;
  }

  public List<String> getWords() {
    String[] words = mDescription.toLowerCase().split("[^\\w#@']+");
    return Arrays.asList(words);
  }

  public List<String> getMentions() {
    return getWordsPrefixedWith("@");
  }

  public List<String> getHashTags() {
    return getWordsPrefixedWith("#");
  }

  private List<String> getWordsPrefixedWith(String prefix) {
    List<String> results = new ArrayList<String>();
    for (String word : getWords()) {
      if (word.startsWith(prefix)) {
        results.add(word);
      }
    }
    return results;
  }
}
