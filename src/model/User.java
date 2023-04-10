package model;

import dto.UserDTO;

public class User {
  private String username;
  private String avatar;
 
  public User() {}

  public User(UserDTO user) {
    this.username = user.username();
    this.avatar = user.avatar();
  }

  public void setTweetUser(String username, String avatar) {
    this.username = username;
    this.avatar = avatar;
  }

  public String getUsername() {
    return this.username;
  }

  public String getAvatar() {
    return this.avatar;
  }
}
