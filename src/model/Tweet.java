package model;

public class Tweet extends User {
  private String text;

  public Tweet(String text, String username, String avatar) {
    this.text = text;
    super.setTweetUser(username, avatar);
  }

  public String getText() {
    return this.text;
  }
}
