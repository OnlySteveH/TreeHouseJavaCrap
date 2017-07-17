package com.teamtreehouse;

import java.util.Date;

public class Treet {
  private String mAuthor;
  private String mDescription;
  private Date mCreationDate;

  public Treet(String author, String description, Date creationdate) {
    mAuthor = author;
    mDescription = description;
    mCreationDate = creationdate;
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

  
}
