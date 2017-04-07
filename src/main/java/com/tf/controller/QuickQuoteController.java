package com.tf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tf.entity.Quote;
import com.tf.entity.QuoteResponse;
import com.tf.service.QuickQuotes;

@RestController
public class QuickQuoteController {
	
	@Autowired
    private QuickQuotes quickQuotes;
    
	@CrossOrigin(origins="*")
    @RequestMapping(value="/QQ",method=RequestMethod.POST)
    public QuoteResponse getQuote(@RequestBody Quote quote) {
        QuoteResponse qe = quickQuotes.getQuote(quote);
        return qe;
    }
	
}
