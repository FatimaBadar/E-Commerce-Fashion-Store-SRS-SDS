package FashionStore;

import java.util.List;

public class User {

	/**
	 * 
	 */
	public List<Product> product;
	/**
	 * 
	 */
	public String username;
	/**
	 * 
	 */
	public Integer userID;
	/**
	 * 
	 */
	public List<Review> review;
	/**
	 * Getter of product
	 */
	public List<Product> getProduct() {
	 	 return product; 
	}
	/**
	 * Setter of product
	 */
	public void setProduct(List<Product> product) { 
		 this.product = product; 
	}
	/**
	 * Getter of username
	 */
	public String getUsername() {
	 	 return username; 
	}
	/**
	 * Setter of username
	 */
	public void setUsername(String username) { 
		 this.username = username; 
	}
	/**
	 * Getter of userID
	 */
	public Integer getUserID() {
	 	 return userID; 
	}
	/**
	 * Setter of userID
	 */
	public void setUserID(Integer userID) { 
		 this.userID = userID; 
	}
	/**
	 * Getter of review
	 */
	public List<Review> getReview() {
	 	 return review; 
	}
	/**
	 * Setter of review
	 */
	public void setReview(List<Review> review) { 
		 this.review = review; 
	}
	/**
	 * 
	 */
	public void register() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void login() { 
		// TODO Auto-generated method
	 } 

}
