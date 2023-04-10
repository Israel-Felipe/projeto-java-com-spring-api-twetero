package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.User;

public class UserRepository {
  private List<User> users = new ArrayList<>();

  public void save(User user) {
    users.add(user);
  }

  public Optional<User> findByUsername(String username) {
    User user = new User();
    for(int i=0; i<users.size(); i++) {
      if(users.get(i).getUsername().equals(username)) {
        user = users.get(i);
      }
    }
    return Optional.ofNullable(user);
  }
}
