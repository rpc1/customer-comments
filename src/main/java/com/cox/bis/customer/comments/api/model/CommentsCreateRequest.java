/**
 * 
 */
package com.cox.bis.customer.comments.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.cox.bis.customer.comments.model.CustomerComment;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author jahill
 *
 */
public class CommentsCreateRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4496918580697415902L;
	private String siteId;
	private String accountNumber;
	private String customerCommentsText; //Limited to 4600 characters and split into elements of 40 characters
	private List<CustomerComment> customerComments; //40 character limit on each CustomerComment
	
	public CommentsCreateRequest () {
		
	}

	/**
	 * @return the siteId
	 */
	public String getSiteId() {
		return siteId;
	}

	/**
	 * @param siteId the siteId to set
	 */
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**
	 * @return the customerComments
	 */
	public List<CustomerComment> getCustomerComments() {
		return customerComments;
	}

	/**
	 * @param customerComments the customerComments to set
	 */
	public void setCustomerComments(List<CustomerComment> customerComments) {
		this.customerComments = customerComments;
	}

	/**
	 * @return the customerCommentsText
	 */
	public String getCustomerCommentsText() {
		return customerCommentsText;
	}

	/**
	 * @param customerCommentsText the customerCommentsText to set
	 */
	public void setCustomerCommentsText(String customerCommentsText) {
		this.customerCommentsText = customerCommentsText;
	}

}
