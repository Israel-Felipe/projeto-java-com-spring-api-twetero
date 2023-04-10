package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.UserDTO;
import service.AuthService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/api/auth/sign-up")
public class AuthController {
  @Autowired
  private AuthService service;

  @PostMapping
  public String signUp(@RequestBody @Valid UserDTO body) {
    service.createUser(body);
    return("OK");
  }
}
