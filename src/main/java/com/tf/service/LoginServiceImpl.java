package com.tf.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tf.entity.QuoteResponse;
import com.tf.entity.User;
import com.tf.repository.UserRepository;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public QuoteResponse login(User user) {
		List<User> users = userRepository.getUser(user.getUserName());
		QuoteResponse response = new QuoteResponse();
		if(users.size()==1) {
			response.setMessage("Successful");
		} else {
			response.setMessage("Failure");
		}
		return response;
	}

}
