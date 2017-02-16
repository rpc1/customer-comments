package com.cox.bis.customer.comments.api.model;

/**
 * 
 */


import java.io.Serializable;
import java.util.List;

import com.cox.bis.customer.comments.model.CustomerComment;
/**
 * @author Kumar Saurav
 *
 * 
 */
public class CommentsSearchRequest  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2652675616025992144L;

	private String siteId;
	private List<CustomerComment> customerComments;
	public List<CustomerComment> getCustomerComments() {
		return customerComments;
	}

	public void setCustomerComments(List<CustomerComment> customerComments) {
		this.customerComments = customerComments;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String accountNumber;	
	private String startDate;
	private String endDate;	
	private String directives;
/*	private String max;
	private String sort;
	private String defaultMax;*/
	public CommentsSearchRequest () {
		
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
	 * @return the directives
	 */
	public String getDirectives() {
		return directives;
	}
	/**
	 * @param directives the directives to set
	 */
	public void setDirectives(String directives) {
		this.directives = directives;
	}
	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the maxSize
	 */
	


}
