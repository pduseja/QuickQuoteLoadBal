package com.tf.service;

import java.util.List;

import com.tf.entity.Policy;

public interface PolicyService {
	
	public List<Policy> getAllPolicy(String userName);

	public Policy getPolicy(Long policyId);

}
