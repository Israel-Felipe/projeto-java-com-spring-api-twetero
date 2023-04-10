package service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import TweterooApplication;
import dto.UserDTO;
import model.User;

@Service
public class AuthService {  
  public void createUser(UserDTO user) {
    TweterooApplication.userRepository.save(new User(user));
  }

  public String getUserAvatar(String username) {
    Optional<User> user = TweterooApplication.userRepository.findByUsername(username);
    if(user.isPresent()) return user.get().getAvatar();
    return "";
  }
}
