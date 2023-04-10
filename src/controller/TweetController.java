package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dto.TweetDTO;
import model.Tweet;
import service.TweetService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/api/tweets")
public class TweetController {
  @Autowired
  private TweetService service;

  @PostMapping
  public String postTweet(@RequestBody @Valid TweetDTO body) {
    service.create(body);
    return("OK");
  }

  @GetMapping
  public List<Tweet> getTweets(@RequestParam("page") String page) {
    return service.listTweetsPage(Integer.parseInt(page));
  }

  @GetMapping("/{username}")
  public List<Tweet> getUserTweets(@PathVariable String username) {
    return service.listUserTweets(username);
  }
}
