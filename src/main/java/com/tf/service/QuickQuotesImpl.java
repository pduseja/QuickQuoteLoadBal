/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tf.service;

import java.util.Date;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tf.entity.Policy;
import com.tf.entity.Quote;
import com.tf.entity.QuoteResponse;
import com.tf.entity.User;
import com.tf.repository.PolicyRepository;
import com.tf.repository.UserRepository;

/**
 *
 * @author rashmsam
 */
@Service
@Transactional
public class QuickQuotesImpl implements QuickQuotes{
    
    
    @Autowired
    private  PolicyRepository policyRepository;
    
    @Autowired
    private  UserRepository userRepository;
    
    private void addUser(User user) {
        if (user!=null){
            this.userRepository.save(user);
        }
    }

    
    private void addPolicy(Policy policy) {
        if (policy!=null){
            this.policyRepository.save(policy);
        }
    }
    
    public QuoteResponse getQuote(Quote quote){        
        
        QuoteResponse qe= new QuoteResponse();
        User user = new User();
        Policy policy = new Policy();
        try{   
           System.out.println("quote.getAge()"+ quote.getAge());
            user.setAge(quote.getAge());
            user.setFirstName(quote.getFirstName());
            user.setLastName(quote.getLastName());
            user.setSmokerFlag(quote.getSmokerFlag());
            user.setState(quote.getState());
            user.setUserName(quote.getFirstName()+"_"+quote.getLastName());
            user.setDob(quote.getDob());
            user.setHeight(quote.getHeight());
            user.setWeight(quote.getWeight());
            user.setGender(quote.getGender());
            this.addUser(user);
            
            
            policy.setPolicyDate(new Date());
            policy.setPolicyId((long) Math.abs(new Random().nextInt()));
            policy.setPremium(quote.getSumAssured()/(quote.getTerm()*12));
            policy.setTerm(quote.getTerm());
            policy.setStatus('A');
            policy.setUser(user);
            policy.setSumAssured(quote.getSumAssured());
            this.addPolicy(policy);  
             qe.setMessage( " Success!!! Your Quote is :"+ policy.getPremium());
        }catch(Exception e){
            e.printStackTrace();
            qe.setMessage("Error: " + e.getMessage());
        }
       
        return qe;
    }

}
