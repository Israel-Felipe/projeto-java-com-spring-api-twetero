package com.tweteroo.tweteroo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import repository.TweetRepository;
import repository.UserRepository;

@SpringBootApplication
public class TweterooApplication {

	public static final UserRepository userRepository = new UserRepository();
	public static final TweetRepository tweetRepository = new TweetRepository();
	
	public static void main(String[] args) {
		SpringApplication.run(TweterooApplication.class, args);
	}

}
