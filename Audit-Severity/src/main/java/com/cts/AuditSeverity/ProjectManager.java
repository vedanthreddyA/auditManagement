package com.cts.AuditSeverity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @version 1.8
 * Its a simple POJO class to store user details required by feign client
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProjectManager {

	/**
	 * This field will be used to store the userId 
	 */
	private String userId;
	/**
	 * This field will be used to store the password 
	 */
	private String password;
	/**
	 * This field will be used to store the authToken 
	 *
	 */
	private String authToken;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	

	

	
	
	
}
