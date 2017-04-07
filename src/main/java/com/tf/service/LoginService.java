package com.tf.service;

import com.tf.entity.QuoteResponse;
import com.tf.entity.User;

public interface LoginService {

	public abstract QuoteResponse login(User user);

}