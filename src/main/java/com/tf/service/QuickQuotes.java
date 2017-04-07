/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tf.service;

import com.tf.entity.Quote;
import com.tf.entity.QuoteResponse;
/**
 *
 * @author rashmsam
 */


public interface QuickQuotes {
    
     public QuoteResponse getQuote(Quote quote);
}
