package com.cts.benchmark.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * This is a POJO class used to store the Authentication response

 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthResponse {
	private String uid;
	private boolean isValid;
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	

}
